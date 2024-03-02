package Java.Tests;

import java.util.Scanner;

public class five {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número.");
        int num_1 = input.nextInt();

        System.out.println("Calculando o quadrado do número...");
        int square = (num_1 * num_1);

        System.out.println("O quadrado do número " + num_1 + " é " + square);
        input.close();
    }

}
