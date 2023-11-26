import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Hello! \n Welcome to a the shape selector! \n ---------------------- \n ###################### \n ---------------------- \n To get started, please select a shape from the menu: \n 1.) Rectangle \n 2.) Triangle \n 3.) Circle \n Select one of the options by entering one of the digits below: ");

        int selection = console.nextInt();

        switch (selection){
            case 1:
                double width, length;
                System.out.println("Enter a width: ");
                width = console.nextDouble();
                System.out.println("Enter a length: ");
                length = console.nextDouble();
                Rectangle rectangle = new Rectangle(width, length);
                System.out.println("Your area of this rectangle is: " + rectangle.calculateArea() + "." + "\n Is your rectangle also a square?: " + rectangle.checkSquare());
                break;

            case 2:
                double radius;
                System.out.println("Enter a radius for the circle: ");
                radius = console.nextDouble();
                Circle newCircle = new Circle(radius);
                System.out.println("Your circle radius is: " + newCircle.calculateArea());
        }


        console.close();

    }
}