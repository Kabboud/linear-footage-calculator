import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void LinearFootageTestOne() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(48, 48, 32, 4000,false);
        lineItems.add(skid1);
        assertEquals(2, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }

    @Test
    public void LinearFootageTestTwo() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(48, 48, 32, 4000,false);
        LineItem skid2 = new LineItem(48, 48, 32, 4000,false);
        lineItems.add(skid1);
        lineItems.add(skid2);
        assertEquals(4, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }
    @Test
    public void LinearFootageTestThree() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(48, 48, 32, 4000,true);
        LineItem skid2 = new LineItem(48, 48, 32, 4000,true);
        lineItems.add(skid1);
        lineItems.add(skid2);
        assertEquals(2, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }
    @Test
    public void LinearFootageTestFour() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(48, 62, 32, 4000,false);
        lineItems.add(skid1);
        assertEquals(4, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }
    @Test
    public void LinearFootageTestFive() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(48, 48, 24, 4000,false);
        LineItem skid2 = new LineItem(60, 96, 24, 4000,false);
        LineItem skid3 = new LineItem(48, 48, 24, 4000,false);
        lineItems.add(skid1);
        lineItems.add(skid2);
        lineItems.add(skid3);
        assertEquals(9, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }
    @Test
    public void LinearFootageTestSix() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(42, 42, 42, 4000,false);
        LineItem skid2 = new LineItem(42, 42, 42, 4000,false);
        LineItem skid3 = new LineItem(42, 42, 42, 4000,false);
        LineItem skid4 = new LineItem(42, 42, 42, 4000,false);
        LineItem skid5 = new LineItem(42, 42, 42, 4000,false);
        LineItem skid6 = new LineItem(42, 42, 42, 4000,false);
        LineItem skid7 = new LineItem(42, 42, 42, 4000,false);
        LineItem skid8 = new LineItem(42, 42, 42, 4000,false);
        lineItems.add(skid1);
        lineItems.add(skid2);
        lineItems.add(skid3);
        lineItems.add(skid4);
        lineItems.add(skid5);
        lineItems.add(skid6);
        lineItems.add(skid7);
        lineItems.add(skid8);
        assertEquals(14, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }
    @Test
    public void LinearFootageTestSeven() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(60, 36, 32, 4000,false);
        LineItem skid2 = new LineItem(36, 60, 32, 4000,false);
        lineItems.add(skid1);
        lineItems.add(skid2);
        assertEquals(4, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }
    @Test
    public void LinearFootageTestEight() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(60, 36, 32, 4000,false);
        LineItem skid2 = new LineItem(36, 60, 32, 4000,false);
        LineItem skid3 = new LineItem(36, 60, 32, 4000,false);
        lineItems.add(skid1);
        lineItems.add(skid2);
        lineItems.add(skid3);
        assertEquals(6.0, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }
    @Test
    public void LinearFootageTestNine() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(60, 36, 32, 4000,false);
        LineItem skid2 = new LineItem(36, 60, 32, 4000,false);
        LineItem skid3 = new LineItem(60, 36, 32, 4000,false);
        lineItems.add(skid1);
        lineItems.add(skid2);
        lineItems.add(skid3);
        assertEquals(7.0, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }
    @Test
    public void LinearFootageTestTen() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(60, 36, 32, 4000,false);
        LineItem skid2 = new LineItem(36, 60, 32, 4000,false);
        LineItem skid3 = new LineItem(60, 36, 32, 4000,false);
        LineItem skid4 = new LineItem(36, 60, 32, 4000,false);
        lineItems.add(skid1);
        lineItems.add(skid2);
        lineItems.add(skid3);
        lineItems.add(skid4);
        assertEquals(8.0, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }
    @Test
    public void LinearFootageTestEleven() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(48, 48, 32, 4000,false);
        LineItem skid2 = new LineItem(48, 96, 32, 4000,false);
        LineItem skid3 = new LineItem(48, 48, 32, 4000,false);
        lineItems.add(skid1);
        lineItems.add(skid2);
        lineItems.add(skid3);
        assertEquals(8.0, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }
    @Test
    public void LinearFootageTestTwelve() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(48, 48, 32, 4000,false);
        LineItem skid2 = new LineItem(48, 96, 32, 4000,false);
        lineItems.add(skid1);
        lineItems.add(skid2);
        assertEquals(6.0, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }
    @Test
    public void LinearFootageTestThirteen() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(48, 48, 32, 4000,true);
        LineItem skid2 = new LineItem(48, 96, 32, 4000,true);
        LineItem skid3 = new LineItem(48, 48, 32, 4000,true);
        lineItems.add(skid1);
        lineItems.add(skid2);
        lineItems.add(skid3);
        assertEquals(4.0, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }
    @Test
    public void LinearFootageTestFourteen() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(48, 48, 32, 4000,true);
        LineItem skid2 = new LineItem(48, 96, 32, 4000,true);
        LineItem skid3 = new LineItem(48, 48, 32, 4000,true);
        LineItem skid4 = new LineItem(48, 48, 32, 4000,true);
        lineItems.add(skid1);
        lineItems.add(skid2);
        lineItems.add(skid3);
        lineItems.add(skid4);
        assertEquals(4.0, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }
    @Test
    public void LinearFootageTestFifteen() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(48, 48, 32, 4000,true);
        LineItem skid2 = new LineItem(48, 96, 32, 4000,true);
        LineItem skid3 = new LineItem(48, 48, 32, 4000,true);
        LineItem skid4 = new LineItem(48, 96, 32, 4000,true);
        lineItems.add(skid1);
        lineItems.add(skid2);
        lineItems.add(skid3);
        lineItems.add(skid4);
        assertEquals(4.0, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }
    @Test
    public void LinearFootageTestSixteen() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(48, 48, 32, 4000,true);
        LineItem skid2 = new LineItem(48, 96, 32, 4000,true);
        LineItem skid3 = new LineItem(48, 48, 32, 4000,true);
        LineItem skid4 = new LineItem(48, 96, 32, 4000,false);
        lineItems.add(skid1);
        lineItems.add(skid2);
        lineItems.add(skid3);
        lineItems.add(skid4);
        assertEquals(8.0, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }
    @Test
    public void LinearFootageTestSeventeen() {
        int truckWidth = 96;
        int truckHeight = 102;
        ArrayList<LineItem> lineItems = new ArrayList<>();

        LineItem skid1 = new LineItem(48, 96, 32, 4000,true);
        LineItem skid2 = new LineItem(48, 96, 32, 4000,true);
        LineItem skid3 = new LineItem(48, 96, 32, 4000,true);
        LineItem skid4 = new LineItem(48, 96, 32, 4000,true);
        lineItems.add(skid1);
        lineItems.add(skid2);
        lineItems.add(skid3);
        lineItems.add(skid4);
        assertEquals(8.0, Main.linearFootage(lineItems, truckWidth, truckHeight));
    }
}