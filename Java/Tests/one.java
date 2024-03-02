package Java.Tests;

import java.util.Scanner;

public class one {
    
    public static void main(String[] args) {
        
        System.out.println("Iniciando programa...");
        Scanner input = new Scanner(System.in);
    
        System.out.println("Digite o primeiro número.");
        int num_1 = input.nextInt();

        System.out.println("Digite o segundo número.");
        int num_2 = input.nextInt();

        System.out.println("Digite o terceiro número.");
        int num_3 = input.nextInt();

        System.out.println("Calculando a soma!");
        int soma = (num_1 + num_2 + num_3);

        System.out.println("A soma dos números é: " + soma);


        input.close();
    }

}
