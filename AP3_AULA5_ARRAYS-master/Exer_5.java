import java.util.Scanner;

public class Exer_5 {
    public static void main(String[] args) {
        float[] notas= new float[5];

        float aux;
        int i;
        float media=0;
        Scanner tc=new Scanner(System.in);

        for(int j=0;j<notas.length;j++){
            System.out.println("Digite sua nota:");
            notas[j]=tc.nextFloat();
        }
        for(i=1;i<notas.length;i++){
            for(int j=0;j<i;j++){
                if(notas[i]>notas[j]){
                    aux=notas[i];
                    notas[i]=notas[j];
                    notas[j]=aux;
                }
            }
        }
        for(i=0;i<notas.length;i++){
            media+=notas[i]/5;
            System.out.println("Ordem descrecente"+ notas[i]);
        }
        System.out.println(" a media aritmetica é:"+media);
    }
}
