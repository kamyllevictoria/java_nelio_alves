package objects_introduction;
import entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class program05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Students students = new Students();

        do{
            System.out.println("Enter your name: ");
            students.name = sc.nextLine();

            System.out.println("First note: ");
            students.firstNote = sc.nextDouble();

            System.out.println("Second note: ");
            students.secondNote = sc.nextDouble();

            System.out.println("Third note: ");
            students.thirdNote = sc.nextDouble();
        } while(students.firstNote < 0 || students.secondNote < 0|| students.thirdNote < 0);

        double media = students.media();
        System.out.printf("Final note: %.2f", media);

        if(students.media() < 60.0){
            System.out.printf("\nFail! Missed points: %.2f", students.MinMedia());
        } else{
            System.out.println("\n Pass! :D");
        }
        sc.close();
    }
}
