package error_treatment;
import java.util.InputMismatchException;
import java.util.Scanner;
public class program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position.");
            //arrayIndexOutOfBoundException = posições inexistentes
        } catch(InputMismatchException e){
            System.out.println("Strings are invalid to access name's postions: ");
        }
        System.out.println("End of program.");
        sc.close();
    }
}
