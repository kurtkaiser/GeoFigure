/*
Kurt Kaiser
CTIM-168 E40
07.13.2018
*/

public class Triangle extends GeoFigure implements SidedObject
{
    public Triangle(){
        super();
    }

    public Triangle(int newWidth, int newHeight){
        super(newWidth, newHeight, "Triangle");

    }

    public void displaySides(){
        System.out.println("Number of sides: 3");
    }

    // Method overload
    public int area(int widthPassed, int heightPassed)
    {
        return widthPassed * heightPassed/2;
    }
}
