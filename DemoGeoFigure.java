/*
Kurt Kaiser
CTIM-168 E40
07.13.2018
*/


public class DemoGeoFigure {



        // Demonstrate Square subclass
        public static void mysquare(){
            Square newSquare = new Square(5, 3);
            System.out.println(newSquare.toString());
            newSquare.displaySides();
            // Demonstrate set methods
            newSquare.setWidth(10);
            newSquare.setHeight(4);
            /*
            I can also manually set the area, setArea(), however area
              is updated if width or height are changed. Also I can set
              figureType, setFigureType(), but don't need to at this time
            */
            // Demonstrate get methods
            System.out.println("-- Set methods used to update width and height, "
                    + " output demonstrates set and get methods.\nWidth: "
                    + newSquare.getWidth() + "\nHeight: " +
                    newSquare.getHeight() + "\nArea: " + newSquare.getArea() +
                    "\nFigure Type: " + newSquare.getFigureType());
            newSquare.displaySides();

        }

    // Demonstrate Square subclass
    public static void myTriangle(){
        Triangle newTriangle = new Triangle(5, 3);
        System.out.println(newTriangle.toString());
        newTriangle.displaySides();
        // Demonstrate set methods
        newTriangle.setWidth(10);
        newTriangle.setHeight(4);
    /*
    I can also manually set the area, setArea(), however area
      is updated if width or height are changed. Also I can set
      figureType, setFigureType(), but don't need to at this time
    */
        // Demonstrate get methods
        System.out.println("-- Set methods used to update width and height, "
                + " output demonstrates set and get methods.\nWidth: " +
                newTriangle.getWidth() + "\nHeight: " +
                newTriangle.getHeight() + "\nArea: " + newTriangle.getArea() +
                "\nFigure Type: " + newTriangle.getFigureType());
        newTriangle.displaySides();

    }

    public static void main(String[] args) {
            System.out.println("--- Square Subclass Demonstration ---");
            mysquare();
        System.out.println("--- Triangle Subclass Demonstration ---");
        myTriangle();
    }
}
