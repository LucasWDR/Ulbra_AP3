import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        int valor[] = new int[4];
        int maior =0;
        int menor = 0,i,j;
        Scanner tc = new Scanner(System.in);

        for (i = 0; i < valor.length; i++) {
            System.out.println("Digite o"+ (i + 1) + "º valor");
            valor[i] = tc.nextInt();
            if (valor[i] > maior) {
                maior = valor[i];
            }
        }
        menor = maior;
        for(j=0;j<4;j++){
            if(valor[j]<menor){
                menor=valor[j];

            }
        }
        System.out.println("Maior valor ="+maior);
        System.out.println("Menor valor ="+menor);

    }
}
