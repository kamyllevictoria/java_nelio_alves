package app;

import java.util.Scanner;

public class baskaraClass {
    public static void main(String[] args) {
        double a, b, c;
        double delta, dRaiz, bQuadrado, raiz1, raiz2;

        System.out.println("Informe o valor de a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();

        System.out.println("Informe o valor de b:");
        b = sc.nextDouble();

        System.out.println("Informe o valor de c:");
        c= sc.nextDouble();

        System.out.printf("Os valores informados foram: %.0f, %.0f, %.0f", a,b,c);

        bQuadrado = Math.pow(b,2);
        delta = bQuadrado - 4 * a* c;
        dRaiz = Math.sqrt(delta);
        if(delta >= 0){
            raiz1 = (-b + delta)/(2*a);
            raiz2 = (-b - delta)/(2*a);
            System.out.printf("\nDelta: %.0f \nRaiz 1: %.0f \nRaiz 2: %.0f", delta, raiz1, raiz2);
        } else{
            System.out.println("\nDelta negativo, impossivel continuar a operação com numeros reais.");
        }
        sc.close();
    }
}
