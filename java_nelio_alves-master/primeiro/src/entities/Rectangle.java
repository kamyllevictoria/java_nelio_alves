package entities;

public class Rectangle {
    public double width;

    public double height;

    public  double area(){
        return width * height;
    }

    public double diagonal(){
        double a = Math.pow(width, 2);
        double b = Math.pow(height, 2);
        return Math.sqrt(a + b);
    }
    public double perimeter(){
        return (width * 2) + (height * 2);
    }
}
