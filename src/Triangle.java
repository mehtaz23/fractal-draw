
// Muntaqim Mehtaz (mehta216)

// importing built-in java classes for Math and Color
import java.awt.*;

import static java.lang.Math.sqrt;

// creating the Triangle Class
public class Triangle {

    // setting data members for the Triangle class
    private double xPosition;
    private double yPosition;
    private double width;
    private double height;
    private Color Color; //data member Color of type Color added to set the color of the triangle shape(s)

    /*
     * constructor for the Triangle class
     * takes in @params XPos YPos Width and Height, all of which are of type double
     */
    public Triangle (double XPos, double YPos, double Width, double Height){
        this.xPosition = XPos;
        this.yPosition = YPos;
        this.width = Width;
        this.height = Height;
    }

    // method for calculating the perimeter of the triangle object(s)
    public double calculatePerimeter (){
        double perimeter = width + (sqrt(((width/2) * (width/2)) + (height * height))) * 2;
        return perimeter;
    }

    // method for calculating the area of the triangle object(s)
    public double calculateArea (){
        double area = (height * width)/2;
        return area;
    }

    // Setter methods

    /* method for setting the color of the triangle object(s)
     * takes in @param Color of type Color
     */
    public void setColor (Color Color){
        this.Color = Color;
    }

    /* method for setting the x,y positions of the triangle object(s)
     * takes in @params XPos and YPos, both of which are of type double
     */
    public void setPos (double XPos, double YPos){
        this.xPosition = XPos;
        this.yPosition = YPos;
    }

    /* method setting the height of the triangle object(s)
     * takes in @param Height of type double
     */
    public void setHeight (double Height){
        this.height = Height;
    }

    /* method setting the width of the triangle object(s)
     * takes in @param Width of type double
     */
    public void setWidth (double Width){
        this.width = Width;
    }

    // Getter methods

    /* method for returning the color of the triangle object(s)
     * @returns the Color
     */
    public Color getColor (){
        return Color;
    }

    /* method for returning the x position of the triangle object(s)
     * @returns the x position of the object
     */
    public double getXPos (){
        return xPosition;
    }

    /* method for obtaining the y position of the triangle object(s)
     * @returns the y position of the object
     */
    public double getYPos (){
        return yPosition;
    }

    /* method for obtaining the height of the triangle object(s)
     * @returns the height of the object
     */
    public double getHeight (){
        return height;
    }

    /* method for obtaining the width of the triangle object(s)
     * @returns the width of the object
     */
    public double getWidth () {
        return width;
    }
}
