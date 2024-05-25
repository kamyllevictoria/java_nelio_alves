package error_treatment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class program02 {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if(sc != null){
                sc.close();
            }
        }
    }
}
