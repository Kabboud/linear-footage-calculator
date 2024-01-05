public class LineItem {
    private int length;
    private int width;
    private int height;
    private int weight;
    private boolean stackable;
    private int effectiveHeight; // Used for stacking
    private int area2D;
    public LineItem(int length, int width, int height, int weight, boolean stackable) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.stackable = stackable;
        this.effectiveHeight = height;
        this.area2D = this.width * this.length;
    }
    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    public int getWeight(){
        return this.weight;
    }
    public boolean isStackable(){
        return this.stackable;
    }
    public int getEffectiveHeight() {
        return this.effectiveHeight;
    }
    public int getArea2D() {
        return this.area2D;
    }
    public void adjustEffectiveHeight(int height) {
        this.effectiveHeight += height;
    }
    public String toString(){
        return "Length = " + this.length + " inches, Width = " + this.width + " inches, Height = " + this.height +
                " inches, Weight = " + this.weight + " lbs.";
    }
}
