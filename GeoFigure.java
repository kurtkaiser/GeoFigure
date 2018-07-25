/*
Kurt Kaiser
CTIM-168 E40
07.13.2018
*/

public abstract class GeoFigure
{
    //Instance variables
    private int width;
    private int height;
    private int area;
    private String figureType;

    // Constructors
    public GeoFigure(){
        width = 0;
        height = 0;
        area = 0;
        figureType = "none";
    } // End default constructor

    public GeoFigure(int newWidth, int newHeight, String newFigureType)
    {
        width = newWidth;
        height = newHeight;
        figureType = newFigureType;
        area = area(newWidth, newHeight);
    } //End constructor method

    // Method is overloaded in both subclasses
    public int area(int widthPassed, int heightPassed)
    {
        return 0;
    } //end area

    // Getter Methods
    public int getWidth()
    {
        return width;
    }//end getWidth

    public int getHeight()
    {
        return height;
    }//end getHeight

    public int getArea()
    {
        return area;
    }//end getArea

    public String getFigureType()
    {
        return figureType;
    }//end getFigureType

    // Setter methods
    public void setWidth(int widthPassed)
    {
        area = area(widthPassed, height);
        width = widthPassed;
    } //end setWidth

    public void setHeight(int heightPassed)
    {
       area = area(width, heightPassed);
       height = heightPassed;
    } //end setHeight

    public void setArea(int areaPassed)
    {
        width = areaPassed;
    } //end setHeight

    public void setFigureType(String figureTypePassed)
    {
        figureType = figureTypePassed;
    }//end setFigureType

    public String toString()
    {
        return "Width: " + width + "\nHeight: " + height + "\nArea: " + area + "\nFigure Type: " + figureType;
    }
} // end of class geofigure
