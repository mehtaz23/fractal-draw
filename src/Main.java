
// Muntaqim Mehtaz (mehta216)

// importing built-in java classes for Color and Scanner
import java.awt.*;
import java.util.Scanner;

// creating the Main class
public class Main {

    //calling the main method to make objects and run the associated methods
    public static void main(String[] args){

        /* creating new Scanner object
         * asking the user for input, which will be one of the type of shapes
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Shape:");
        String userInput = input.nextLine();

        /* implementing if statement to check for user input
         * user input of "Circle" creates canvas on which to draw the circle fractal
         */
        if (userInput.equals("Circle")) {

            // creating a Canvas object to call the Canvas in order to create a new canvas
            Canvas drawing = new Canvas(800, 800);

            // creating a series of Circle objects
            Circle circ1 = new Circle(400, 300, 200);
            circ1.setColor(Color.BLUE);
            drawing.drawShape(circ1);
            Circle circ2 = new Circle(400,200,100);
            circ2.setColor(Color.RED);
            drawing.drawShape(circ2);
            Circle circ3 = new Circle(400,400,100);
            circ3.setColor(Color.RED);
            drawing.drawShape(circ3);
            Circle circ4 = new Circle(400,150,50);
            circ4.setColor(Color.GREEN);
            drawing.drawShape(circ4);
            Circle circ5 = new Circle(400,250,50);
            circ5.setColor(Color.GREEN);
            drawing.drawShape(circ5);
            Circle circ6 = new Circle(400,350,50);
            circ6.setColor(Color.GREEN);
            drawing.drawShape(circ6);
            Circle circ7 = new Circle(400,450,50);
            circ7.setColor(Color.GREEN);
            drawing.drawShape(circ7);

            // calculating the total area of the fractal by calling the calculateArea methods for all the Circle objects
            double totalArea = circ1.calculateArea() + circ2.calculateArea() + circ3.calculateArea() + circ4.calculateArea() + circ5.calculateArea() + circ6.calculateArea() + circ7.calculateArea();
            // printing out the value of the total area
            System.out.println("Total area of Circle fractal = " + totalArea);

        }

        /* implementing else if statement to check for user input
         * user input of "Triangle" creates canvas on which to draw the triangle fractal
         */
        else if (userInput.equals("Triangle")) {

            // creating a Canvas object to call the Canvas in order to create a new canvas
            Canvas drawing = new Canvas(800, 800);

            // creating a series of Triangle objects
            Triangle tri1 = new Triangle(300, 500, 200, 200);
            tri1.setColor(Color.BLUE);
            drawing.drawShape(tri1);
            Triangle tri2 = new Triangle(200,500,100,100);
            tri2.setColor(Color.DARK_GRAY);
            drawing.drawShape(tri2);
            Triangle tri3 = new Triangle(500,500,100,100);
            tri3.setColor(Color.DARK_GRAY);
            drawing.drawShape(tri3);
            Triangle tri4 = new Triangle(350,300,100,100);
            tri4.setColor(Color.DARK_GRAY);
            drawing.drawShape(tri4);
            Triangle tri5 = new Triangle(150,500,50,50);
            tri5.setColor(Color.CYAN);
            drawing.drawShape(tri5);
            Triangle tri6 = new Triangle(600,500,50,50);
            tri6.setColor(Color.CYAN);
            drawing.drawShape(tri6);
            Triangle tri7 = new Triangle(300,500,50,50);
            tri7.setColor(Color.CYAN);
            drawing.drawShape(tri7);
            Triangle tri8 = new Triangle(450,500,50,50);
            tri8.setColor(Color.CYAN);
            drawing.drawShape(tri8);
            Triangle tri9 = new Triangle(225,400,50,50);
            tri9.setColor(Color.CYAN);
            drawing.drawShape(tri9);
            Triangle tri10 = new Triangle(525,400,50,50);
            tri10.setColor(Color.CYAN);
            drawing.drawShape(tri10);
            Triangle tri11 = new Triangle(300,300,50,50);
            tri11.setColor(Color.CYAN);
            drawing.drawShape(tri11);
            Triangle tri12 = new Triangle(450,300,50,50);
            tri12.setColor(Color.CYAN);
            drawing.drawShape(tri12);
            Triangle tri13 = new Triangle(375,200,50,50);
            tri13.setColor(Color.CYAN);
            drawing.drawShape(tri13);

            // calculating the total area of the fractal by calling the calculateArea methods for all the Triangle objects
            double totalArea = tri1.calculateArea() + tri2.calculateArea() + tri3.calculateArea() + tri4.calculateArea() + tri5.calculateArea() + tri6.calculateArea() + tri7.calculateArea() + tri8.calculateArea() + tri9.calculateArea() + tri10.calculateArea() + tri11.calculateArea() + tri12.calculateArea() + tri13.calculateArea();
           // printing out the value of the total area
            System.out.println("Total area of Triangle fractal = " + totalArea);

        }

        /* implementing else statement to check for user input
         * user input of "Rectangle" creates canvas on which to draw the rectangle fractal
         */
        else if (userInput.equals("Rectangle")){

            // creating a Canvas object to call the Canvas in order to create a new canvas
            Canvas drawing = new Canvas(800,800);

            // creating a series of Rectangle objects
            Rectangle rec1 = new Rectangle(300,300,200,100);
            rec1.setColor(Color.BLUE);
            drawing.drawShape(rec1);
            Rectangle rec2 = new Rectangle(200,400,100,50);
            rec2.setColor(Color.MAGENTA);
            drawing.drawShape(rec2);
            Rectangle rec3 = new Rectangle(500,400,100,50);
            rec3.setColor(Color.MAGENTA);
            drawing.drawShape(rec3);
            Rectangle rec4 = new Rectangle(200,250,100,50);
            rec4.setColor(Color.MAGENTA);
            drawing.drawShape(rec4);
            Rectangle rec5 = new Rectangle(500,250,100,50);
            rec5.setColor(Color.MAGENTA);
            drawing.drawShape(rec5);
            Rectangle rec6 = new Rectangle(150,450,50,25);
            rec6.setColor(Color.ORANGE);
            drawing.drawShape(rec6);
            Rectangle rec7 = new Rectangle(450,450,50,25);
            rec7.setColor(Color.ORANGE);
            drawing.drawShape(rec7);
            Rectangle rec8 = new Rectangle(300,450,50,25);
            rec8.setColor(Color.ORANGE);
            drawing.drawShape(rec8);
            Rectangle rec9 = new Rectangle(600,450,50,25);
            rec9.setColor(Color.ORANGE);
            drawing.drawShape(rec9);
            Rectangle rec10 = new Rectangle(150,300,50,25);
            rec10.setColor(Color.ORANGE);
            drawing.drawShape(rec10);
            Rectangle rec11 = new Rectangle(450,300,50,25);
            rec11.setColor(Color.ORANGE);
            drawing.drawShape(rec11);
            Rectangle rec12 = new Rectangle(300,300,50,25);
            rec12.setColor(Color.ORANGE);
            drawing.drawShape(rec12);
            Rectangle rec13 = new Rectangle(600,300,50,25);
            rec13.setColor(Color.ORANGE);
            drawing.drawShape(rec13);
            Rectangle rec14 = new Rectangle(150,375,50,25);
            rec14.setColor(Color.ORANGE);
            drawing.drawShape(rec14);
            Rectangle rec15 = new Rectangle(450,375,50,25);
            rec15.setColor(Color.ORANGE);
            drawing.drawShape(rec15);
            Rectangle rec16 = new Rectangle(300,375,50,25);
            rec16.setColor(Color.ORANGE);
            drawing.drawShape(rec16);
            Rectangle rec17 = new Rectangle(600,375,50,25);
            rec17.setColor(Color.ORANGE);
            drawing.drawShape(rec17);
            Rectangle rec18 = new Rectangle(150,225,50,25);
            rec18.setColor(Color.ORANGE);
            drawing.drawShape(rec18);
            Rectangle rec19 = new Rectangle(450,225,50,25);
            rec19.setColor(Color.ORANGE);
            drawing.drawShape(rec19);
            Rectangle rec20 = new Rectangle(300,225,50,25);
            rec20.setColor(Color.ORANGE);
            drawing.drawShape(rec20);
            Rectangle rec21 = new Rectangle(600,225,50,25);
            rec21.setColor(Color.ORANGE);
            drawing.drawShape(rec21);

            // calculating the total area of the fractal by calling the calculateArea methods for all the Rectangle objects
            double totalArea = rec1.calculateArea() + rec2.calculateArea() + rec3.calculateArea() + rec4.calculateArea() + rec5.calculateArea() + rec6.calculateArea() + rec7.calculateArea() + rec8.calculateArea() + rec9.calculateArea() + rec10.calculateArea() + rec11.calculateArea() + rec12.calculateArea() + rec13.calculateArea() + rec14.calculateArea() + rec15.calculateArea() + rec16.calculateArea() + rec17.calculateArea() + rec18.calculateArea() + rec19.calculateArea() + rec20.calculateArea() + rec21.calculateArea();
            // printing out the value of the total area
            System.out.println("Total area of Rectangle fractal = " + totalArea);

        }

    }
}
