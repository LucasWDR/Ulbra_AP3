import java.util.Scanner;

import static java.lang.Math.*;

public class exer_7 {
    public static void main(String[] args) {
        double num, expoente;
        double result;

        Scanner koe = new Scanner(System.in);

        System.out.println("Digite um numero:");
        num = koe.nextInt();
        System.out.println("digite o expoente:");
        expoente = koe.nextInt();
        double result = (Math.pow(num ^ expoente));

        System.out.println("Resultado:" + result);


    }
}
