public class Exer_8 {
    public static void main(String[] args) {
        int[] par = new int[10];
        int[] impar = new int[10];
        int sorteio, i,j;

        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                sorteio = (int) (Math.random() * 20);

                if (sorteio % 2 == 0) {
                    par[i] = sorteio;
                } else {
                    impar[j] = sorteio;
                }
            }
        }

        for (i = 1; i <= 20; i++) {
            System.out.println("Numeros pares" + par[i]);
        }
        for (j = 1; j <= 20; j++) {
            System.out.println("Numeros impares" + impar[i]);
        }
    }
}
