import javax.swing.*;
import java.awt.geom.Line2D;

public class exercicio3 {

    public static void main(String[] args) {

        double n1, n2, media, notaTrab;

        String teclado;

        teclado = JOptionPane.showInputDialog("Digite a nota da primeira prova:");
        n1 = Double.parseDouble(teclado);

        teclado = JOptionPane.showInputDialog("Digite a nota da segunda  prova:");
        n2 = Double.parseDouble(teclado);

        teclado = JOptionPane.showInputDialog("Digite a nota do trabalho:");
        notaTrab = Double.parseDouble(teclado);

        media = (n1 + n2 + notaTrab) / 3;

        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "A media do aluno é:" + media, "ALUNO APROVADO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "A media do aluno é:" + media, "aluno REPROVADO", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
