import java.util.InputMismatchException;
import java.util.Scanner;
import shapes.Rectangle;
import shapes.Circle;
import shapes.Triangle;

class Calculator {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Hello! \n Welcome to a the shape selector! \n ---------------------- \n ###################### \n ---------------------- \n To get started, please select a shape from the menu: \n 1.) Rectangle \n 2.) Circle \n 3.) Triangle \n Select one of the options by entering one of the digits below: ");


        try {
            int selection = console.nextInt();
            switch (selection){
                case 1:
                    double width, length;
                    System.out.println("Enter a width: ");
                    width = validateInput(console.nextDouble());
                    System.out.println("Enter a length: ");
                    length = validateInput(console.nextDouble());
                    Rectangle rectangle = new Rectangle(width, length);
                    System.out.println("Your area of this rectangle is: " + rectangle.calculateArea() + "." + "\n Is your rectangle also a square?: " + rectangle.checkSquare());
                    break;

                case 2:
                    double radius;
                    System.out.println("Enter a radius for the circle: ");
                    radius = validateInput(console.nextDouble());
                    Circle newCircle = new Circle(radius);
                    System.out.println("Your circle area is: " + newCircle.calculateArea());
                    break;

                case 3:
                    double height, base;
                    System.out.println("Enter a height for the triangle: ");
                    height = validateInput(console.nextDouble());
                    System.out.println("Enter a base: ");
                    base = validateInput(console.nextDouble());
                    Triangle newTriangle = new Triangle(height, base);
                    System.out.println("Your triangle area is: " + newTriangle.calculateArea());
                    break;

                default:
                    System.out.println("You did not enter a proper number! Try again!");
                    break;
            }
        } catch (InputMismatchException e){
            System.out.println("Improper input! Not a number! Error! Error! Error!" + e.getLocalizedMessage());
        }

        console.close();
    }

    private static double validateInput(double value){
        if(value <= 0){
            throw new IllegalArgumentException("Not a valid input!");
        }
        return value;
    }
}