import java.util.Scanner;

public class exer_5 {
    public static void main(String[] args) {

        String frase;

        Scanner koe = new Scanner(System.in);

        System.out.println("Digite a frase:");
        frase = koe.nextLine();

        if (frase.contains("sexo") == true || frase.contains("sexual") == true) {

            System.out.println("Conteudo improprio");
        } else {
            System.out.println("Conteudo Liberado");
        }

    }
}
