import javax.swing.*;

public class exercicio2 {

    public static void main(String[] args) {

        double valorVenal;

        double valorNegociado;

        double imposto;

        double valorPago;

        String teclado;

        teclado=JOptionPane.showInputDialog("Digite o valor da transação:");
        valorNegociado=Double.parseDouble(teclado);

        teclado=JOptionPane.showInputDialog("Digite o valor da venal:");
        valorVenal=Double.parseDouble(teclado);

        teclado=JOptionPane.showInputDialog("Digite o valor do imposto:");
        imposto=Double.parseDouble(teclado);

        if(valorNegociado> valorVenal){

            valorPago =valorNegociado*imposto/100;
        }else{
            valorPago= valorVenal*imposto/100;
        }

        JOptionPane.showMessageDialog(null,"Valor a ser pago é:"+ valorPago);
    }
}
