/*
Kurt Kaiser
CTIM-168 E40
07.13.2018
*/

public class Square extends GeoFigure implements SidedObject
{
    private int sides;

    public Square(){
        super();
    }

    public Square(int newWidth, int newHeight){
        super(newWidth, newHeight, "Square");
    }

    public void displaySides(){
        System.out.println("Number of sides: 4");
    }

    // Method overload
    public int area(int widthPassed, int heightPassed)
    {
        return widthPassed * heightPassed;
    }
}
