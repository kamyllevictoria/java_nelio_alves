package inheritance_polymorphism.entities;

import inheritance_polymorphism.enums.Color;

public class Circle extends Shape{
    private double radius;
    public Circle(){
    }
    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(2,radius) * Math.PI;
    }


}
