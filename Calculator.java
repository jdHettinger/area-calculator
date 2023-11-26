
import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        double length, width;
        Scanner console = new Scanner(System.in);
        System.out.println("Hi!");
        System.out.println("Calculate the area of a rectangle: ");
        System.out.println("Enter a width: ");
        width = console.nextDouble();
        System.out.println("Length?: ");
        length = console.nextDouble();
        console.close();
        Rectangle area = new Rectangle(width,length);

        System.out.println("You're area is: " + area.calculateArea());
    }

}