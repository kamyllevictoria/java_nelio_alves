package inheritance_polymorphism.application;

import inheritance_polymorphism.entities.Circle;
import inheritance_polymorphism.entities.Rectangle;
import inheritance_polymorphism.entities.Shape;
import inheritance_polymorphism.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Shape #" + i + "data:");

            System.out.print("Rectangle or Circle? (r/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Color (BLACK, BLUE OR RED): ");
            Color color = Color.valueOf(sc.next());

            if(ch == 'r'){
                System.out.println("Width: ");
                double w = sc.nextDouble();
                System.out.println("Heigth: ");
                double h = sc.nextDouble();
                list.add(new Rectangle(color, w, h));
            } else{
                System.out.println("Radius: ");
                double r = sc.nextDouble();
                list.add(new Circle(color, r));
            }
        }
        System.out.println();

        System.out.println("Shape areas: ");
        for(Shape shape : list){
            System.out.printf("%.2f%n", shape.area());
        }


        sc.close();
    }
}
