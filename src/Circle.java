
// Muntaqim Mehtaz (mehta216)

// importing built-in java classes for Math and Color
import java.awt.*;

import static java.lang.Math.PI;

// creating the Circle Class
public class Circle {

    // setting data members for the Circle class
    private double xPosition;
    private double yPosition;
    private double radius;
    private Color Color; //data member Color of type Color added to set the color of the circle shape(s)

    /*
    * constructor for the Circle class
    * takes in @params XPos YPos and Radius, all of which are of type double
    */
    public Circle (double XPos, double YPos, double Radius){
        this.xPosition = XPos;
        this.yPosition = YPos;
        this.radius = Radius;
    }

    // method for calculating the perimeter of the circle object(s)
    public double calculatePerimeter(){
        double perimeter = 2 * PI * radius;
        return perimeter;
    }

    // method for calculating the area of the circle object(s)
    public double calculateArea(){
        double area = PI * (radius * radius);
        return area;
    }

    // Setter methods

    /* method for setting the color of the circle object(s)
     * takes in @param Color of type Color
     */
    public void setColor (Color Color){
        this.Color = Color;
    }

    /* method for setting the x,y positions of the circle object(s)
     * takes in @params XPos and YPos, both of which are of type double
     */
    public void setPos (double XPos, double YPos){
        this.xPosition = XPos;
        this.yPosition = YPos;
    }

    /* method setting the radius of the circle object(s)
     * takes in @param Radius of type double
     */
    public void setRadius (double Radius){
        this.radius = Radius;
    }

    // Getter methods

    /* method for returning the color of the circle object(s)
     * @returns the Color
     */
    public Color getColor (){
        return Color;
    }

    /* method for returning the x position of the circle object(s)
     * @returns the x position of the object
     */
    public double getXPos(){
        return xPosition;
    }

    /* method for obtaining the y position of the circle object(s)
     * @returns the y position of the object
     */
    public double getYPos(){
        return yPosition;
    }

    /* method for obtaining the radius of the circle object(s)
     * @returns the radius of the object
     */
    public double getRadius(){
        return radius;
    }

}
