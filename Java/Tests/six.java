package Java.Tests;

import java.util.Scanner;

public class six {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celcius.");
        float celcius = input.nextFloat();
        
        System.out.println("Convertendo a temperatura em Fahrenheit.");
        float fahrenheit = (celcius * (9f/5f) + 32);

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

    }

}
