package Java.Tests;

import java.util.Scanner;

public class two {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número.");
        int num_1 = input.nextInt();

        System.out.println("Digite o segundo número.");
        int num_2 = input.nextInt();

        System.out.println("Digite o terceiro número.");
        int num_3 = input.nextInt();

        System.out.println("Calculando a média.");
        int média = ((num_1 + num_2 + num_3) / 3);

        System.out.println("A média dos três números é: " + média);

        input.close();
    }

}
