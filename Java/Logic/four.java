package Java.Logic;

import java.util.Scanner;

public class four {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número.");
        float num_1 = input.nextFloat();

        System.out.println("Digite o segundo número.");
        float num_2 = input.nextFloat();

        System.out.println("Calculando o menor número.");
        float minor = minor(num_1, num_2);

        System.out.println("O menor número entre " + num_1 + " e " + num_2 + " é " + minor);
        
        input.close();
    }

    public static float minor(float num_1, float num_2) {

        float result = 0;
        if (num_1 > num_2) {
            result =  num_2;
        } else 
        if (num_1 < num_2) {
            result = num_1;
        } else
        if (num_1 == num_2) {
            result = 0;
        }
        return result;
    }

}
