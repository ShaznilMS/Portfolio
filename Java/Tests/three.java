package Java.Tests;

import java.util.Scanner;

public class three {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número.");
        float num_1 = input.nextFloat();

        System.out.println("Calculando a quinta parte...");
        float qp = (num_1 / 5);

        System.out.println("A quinta parte de " + num_1 + " é " + qp);

        input.close();
    }
    
}