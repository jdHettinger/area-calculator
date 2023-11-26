public class Triangle extends Shape{

    double height, base;

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }
    @Override
    public double calculateArea() {
        return 0.5*base*height;
    }
}
