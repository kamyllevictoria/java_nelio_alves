package inheritance_polymorphism.entities;

import inheritance_polymorphism.enums.Color;

public class Rectangle extends Shape{

    private double width;
    private double heigth;

    public Rectangle(Color color, double width, double heigth) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangle(){
    }
    @Override
    public double area() {
        return width * heigth;
    }
}
