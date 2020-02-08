import java.util.Scanner;

public class exercicio1 {


    /*
    Usando a classe Scanner para entrada de dados, crie uma classe que receba o valor de um produto e a porcentagem de desconto,
    calcule e mostre o valor do desconto e o valor do produto com o desconto.

    Observação: o valor do desconto é calculado por meio da fórmula:
    valor do desconto = valor do produto * percentual de desconto / 100.
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double valor;
        double desconto;
        double valorDesconto;

        System.out.println("Digite o valor do produto: ");

        valor = teclado.nextDouble();

        System.out.println("Digite o valor de desconto: ");

        desconto = teclado.nextDouble();

        valorDesconto = valor * desconto / 100;

        System.out.println("Valor do produto:" + valor);

        System.out.println("Valor do Desconto:" + desconto);

        System.out.println("Valor do produto com desconto :" + (valor - desconto));


    }
}
