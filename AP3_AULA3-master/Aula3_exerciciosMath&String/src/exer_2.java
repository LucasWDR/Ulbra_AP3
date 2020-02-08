import java.util.Scanner;

public class exer_2 {
    public static void main(String[] args) {
        double Valor=0;
        double acrescimo;

        Scanner Koe = new Scanner(System.in);

        do {
            System.out.println("Digite um numero:");

            Valor = Koe.nextDouble();
            acrescimo = Valor * 0.12;

            System.out.println(Math.round(Valor + acrescimo));
        } while (Valor != 0);
    }
}
