public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int height, int pillows, int quilt, int sheets) {
        this.height = height;
        this.pillows = pillows;
        this.quilt = quilt;
        this.sheets = sheets;
        this.style = style;
    }
    public void make(){
        System.out.print("Bed -> Making | ");
    }

    public String getStyle(){
        return style;
    }

    public int getPillows(){
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }
    public int getQuilt(){
        return quilt;
    }
}
/**
 * make() has no return type and prints a message to the effect that the bed is being made;
 * getStyle() which returns the value of style; getPillows() returns the number of pillows;
 * getHeight() returns the height of the bed; getSheets()
 * returns the number of sheets on the bed; and getQuilt() returns the value of quilt.
 **/
