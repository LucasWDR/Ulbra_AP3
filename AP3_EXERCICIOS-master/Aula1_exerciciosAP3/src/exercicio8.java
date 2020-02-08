import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        int tabuada;
        int x;

        Scanner tc = new Scanner(System.in);

        System.out.println("Digite um numero para ver a Tabauda:");
        tabuada = tc.nextInt();
        for (x = 0; x <= 10; x++) {
            System.out.println("Tabuada do:" + tabuada);
            System.out.println(x + "x" + tabuada + "=");
        }
    }
}