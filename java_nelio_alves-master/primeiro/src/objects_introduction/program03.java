package objects_introduction;
import entities.Rectangle;
import java.util.Scanner;

public class program03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the rectangle sides: ");

        System.out.println("Width: ");
        rectangle.width = sc.nextDouble();

        System.out.println("Height: ");
        rectangle.height = sc.nextDouble();

        double areaR = rectangle.area();
        double diagonalR = rectangle.diagonal();
        double perimeterR = rectangle.perimeter();

        System.out.printf("Area: %.2f", areaR);
        System.out.printf("\nPerimeter: %.2f", perimeterR);
        System.out.printf("\nDiagonal: %.2f", diagonalR);

        sc.close();
    }


}
