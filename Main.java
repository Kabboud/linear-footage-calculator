import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Just using main as testing playground
        int truckWidth = 96;
        int truckHeight = 102;
        LineItem skid1 = new LineItem(60, 93, 32, 4000,true);
        LineItem skid2 = new LineItem(60, 94, 32, 4000,true);
        LineItem skid3 = new LineItem(60, 95, 32, 4000,true);
        LineItem skid4 = new LineItem(60, 96, 32, 4000,true);
//        LineItem skid5 = new LineItem(42, 42, 42, 600,false);
//        LineItem skid6 = new LineItem(42, 42, 42, 600,false);
//        LineItem skid7 = new LineItem(42, 42, 42, 600,false);
//        LineItem skid8 = new LineItem(42, 42, 42, 600,false);
        ArrayList<LineItem> lineItems = new ArrayList<>();
        lineItems.add(skid1);
        lineItems.add(skid2);
        lineItems.add(skid3);
        lineItems.add(skid4);
//        lineItems.add(skid5);
//        lineItems.add(skid6);
//        lineItems.add(skid7);
//        lineItems.add(skid8);
        System.out.println(linearFootage(lineItems, truckWidth, truckHeight));
    }
    public static double linearFootage(ArrayList<LineItem> lineItems, int truckWidth, int truckHeight) {
        double leftSideLength = 0; // Total length of the left/right sides
        double rightSideLength = 0;
        double previousWidth = 0; // Width of the previously added item (Only used if we added to the intended side)
        boolean leftSide = true; // Tracks which side we are looking to add to next.
        ArrayList<LineItem> stackableItems = new ArrayList<>();

        // Sorting line items by area for stacking purposes (We prefer higher area items being placed in truck first)
        ArrayList<LineItem> sortedItems = lineItems.stream()
                .sorted(Comparator.comparing(LineItem::getArea2D).reversed())
                .collect(Collectors.toCollection(ArrayList::new));

        for (LineItem item: sortedItems){
            int length = item.getLength();

            if (!stackableItems.isEmpty() && item.isStackable()) { // Attempt to stack new item to avoid increasing footage
                if (attemptStacking(stackableItems, truckHeight, item)) {
                    continue; // Move on to next item if we've successfully stacked this one
                }
            }
            else if (item.isStackable()) {
                stackableItems.add(item); // Add item to list of stackable items for future operations
            }

            if (sortedItems.size() == 1 && sortedItems.get(0).getWidth() > truckWidth/2) { // If we're only dealing with one item
                return (double) length / 12;
            }
            if (item.getWidth() == truckWidth) { // Add to both side lengths if skid takes up total width of the truck
                leftSideLength+= (double) length / 12;
                rightSideLength+= (double) length / 12;
                continue;
            }

            if (leftSide) {
                if (item.getWidth() + previousWidth <= truckWidth) { // Checks if we can safely add to this side
                    leftSideLength += (double) length / 12;
                    previousWidth = item.getWidth();
                }
                else { // Adds to opposite side if prior condition not met
                    rightSideLength += (double) length / 12;
                }
            }
            else {
                if (item.getWidth() + previousWidth <= truckWidth) {
                    rightSideLength += (double) length / 12;
                    previousWidth = item.getWidth();
                }
                else {
                    leftSideLength += (double) length / 12;
                }
            }
            leftSide = !leftSide; // Switches intended loading side
        }
        return Math.ceil((leftSideLength + rightSideLength) / 2); // Optimal Linear Footage calculation
    }
    public static boolean attemptStacking(ArrayList<LineItem> stackableItems, int truckHeight, LineItem newItem) {
        for (LineItem item: stackableItems) {
            if (newItem.getLength() <= item.getLength() && newItem.getWidth() <= item.getWidth() // Check if item fits
                    && item.getEffectiveHeight() + newItem.getHeight() <= truckHeight) {
                 // Setting up remaining available area
                int remainingWidth = item.getWidth() - newItem.getWidth();
                if (remainingWidth > 0) {
                    int remainingHeight = item.getEffectiveHeight();
                    LineItem availArea = new LineItem(item.getLength(), remainingWidth, remainingHeight,
                            0, true);
                    stackableItems.add(availArea);
                }
                stackableItems.remove(item); // Remove item that is being stacked on
                newItem.adjustEffectiveHeight(item.getEffectiveHeight()); // Adjust effective height of item we are adding
                stackableItems.add(newItem); // Add new item that we may be able to stack on now.
                return true;
            }
        }
        return false;
    }
}
