import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        String nome=new String();
        double valor;
        double desconto;

        Scanner tc=new Scanner(System.in);

        System.out.println("Digite o valor do seu produto:");
        nome =tc.next();
        System.out.println("Digite o valor do seu produto:");
        valor =tc.nextDouble();

        if(valor<=0){
            do{
                System.out.println("Numero invalido");
                System.out.println("valor:");*
                valor=tc.nextDouble();

            }while(valor<=0);
        }
        if(valor>=50 && valor<200){
            desconto(valor*5)/100;
            System.out.println("Nome do produto"+nome);
            System.out.println("Valor original do produto"+valor);
            System.out.println("Valor original do produto com desconto"+desconto);
        }else if(valor>= 200 && valor<500){
            desconto =(valor*6)/100;
            System.out.println("Nome do produto"+nome);
            System.out.println("Valor original do produto"+valor);
            System.out.println("Valor original do produto com desconto"+desconto);
        }else if(valor>= 500 && valor<1000){
            desconto= (valor*7)/100;
            System.out.println("Nome do produto"+nome);
            System.out.println("Valor original do produto"+valor);
            System.out.println("Valor original do produto com desconto"+desconto);
        }else if(valor >=1000){
            desconto(valor*8)/100;
            System.out.println("Nome do produto"+nome);
            System.out.println("Valor original do produto"+valor);
            System.out.println("Valor original do produto com desconto"+desconto);
        }else if (valor<0){
            System.out.println("Valor invalido!");
        }


    }
}
