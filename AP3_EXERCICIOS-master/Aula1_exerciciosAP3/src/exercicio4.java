import javax.swing.*;
import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        char sexo;
        int idade, contribuicao;


        Scanner tc = new Scanner(System.in);

        System.out.println("Digite o sexo da pessoa S/M:");
        sexo = tc.next().charAt(0);
        System.out.println("Informe a idade:");
        idade = tc.nextInt();
        System.out.println("Informe quantos anos de contribuicao:");
        contribuicao = tc.nextInt();

        if (idade >= 60 && sexo == 'f') {
            System.out.println("você já tem direito a aposentadoria");
        } else if (idade >= 65 && sexo == 'm') {
            System.out.println("você já tem direito a aposentadoria");
        } else if (idade < 60 && sexo == 'f'){
            System.out.println("Voce nao tem direito a aposentadoria");
        }else if (idade < 65 && sexo == 'm'){
            System.out.println("voce nao tem direito a aposentadoria");
        }

        if (contribuicao >= 30 && sexo == 'f') {
            System.out.println("voce já tem o direito a paosentadoria por ano de contribuicao");
        }
        if (contribuicao >= 30 && sexo == 'm') {
            System.out.println("voce já tem o direito a paosentadoria por ano de contribuicao");
        }

    }
}
