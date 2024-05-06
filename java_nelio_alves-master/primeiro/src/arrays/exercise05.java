package arrays;

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("How many numbers do you want to enter? ");
        n = sc.nextInt();

        double[] numbers = new double[n];

        double maior;
        int posicaoMaior;

        System.out.println("Enter the first number: ");
        numbers[0] = sc.nextDouble();
        maior = numbers[0];
        posicaoMaior = 0;

        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = sc.nextDouble();

            if (numbers[i] > maior) {
                maior = numbers[i];
                posicaoMaior = i; //
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Posição do maior valor: " + posicaoMaior);

        sc.close();
    }
}
