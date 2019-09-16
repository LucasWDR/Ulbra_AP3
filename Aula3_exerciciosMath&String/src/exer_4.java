import java.util.Scanner;

public class exer_4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int x;

        String frase;

        Scanner tc = new Scanner(System.in);

        System.out.println("Digite uma frase para armazenar na String:");
        frase = tc.nextLine();


        frase = frase.replace(" ", "");
        System.out.println("Frase sem os espaços:" + frase);

        frase = new StringBuilder(frase).reverse().toString();
        System.out.println("Frase ao contrario:" +frase);


    }
}
