package error_treatment;
import java.util.InputMismatchException;
import java.util.Scanner;

public class program01 {
    public static void main(String[] args) {
        method1();
        System.out.println("End of program.");
    }


    public static void method1(){
        System.out.println("Method 1 starts.");
        method2();
        System.out.println("Method 1 ends.");
    }
    public static void method2(){

        System.out.println("Method 2 starts.");

        Scanner sc = new Scanner (System.in);

        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position.");
            e.printStackTrace();
            sc.next();
        }
        catch(InputMismatchException e){
            System.out.println("Strings are invalid to access name's postions: ");
        }

        System.out.println("Method 2 ends.");
        sc.close();
    }
}
