public class Rectangle {

    public double width;
    public double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double calculateArea(){
        return width * length;
    }
}
