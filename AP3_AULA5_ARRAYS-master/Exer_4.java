import javax.swing.*;
import java.util.Scanner;

public class Exer_4 {
    public static void main(String[] args) {
        String palavra;
        int i;

        Scanner tc = new Scanner(System.in);
        System.out.println("Digite a palavra:");
        palavra = tc.nextLine();

        String palavra2 = new StringBuilder(palavra).reverse().toString();

        for (i = 0; i < palavra2.length(); i++) {

            if (palavra.equals(palavra2)) {
                JOptionPane.showMessageDialog(null, palavra + "é uma palavra palindroma!");
            } else {
                JOptionPane.showMessageDialog(null, palavra + "Não é uma palavra palindroma!");
            }


        }
    }
}
