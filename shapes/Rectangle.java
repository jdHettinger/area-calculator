package shapes;
public class Rectangle extends Shape{

    public double width;
    public double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    @Override
    public double calculateArea(){
        return width * length;
    }

    public boolean checkSquare(){
        return (width == length);
    }
}
