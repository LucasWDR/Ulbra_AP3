import java.util.Arrays;

public class exer_3 {
    public static void main(String[] args) {
        int resultado, i;


        int sorteio = (int) (Math.random() * 5);

        resultado = sorteio + 5;

        System.out.println(resultado);

        int senha[] = new int[resultado];

        for (i = 0; i < resultado; i++) ;

        senha[i] = (int) (Math.random() * resultado);


        System.out.println("Sua senha é" + Arrays.toString(senha));
    }
}

