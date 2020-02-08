public class Exer_7 {
    public static void main(String[] args) {
        int[][] dimesoes = new int[40][40];
        int sorteio, i, j;

        for (j = 0; j < 40; j++) {
            for (i = 0; i < 40; i++) {
                sorteio = (int) (Math.random() * 250);
                dimesoes[j][i] = sorteio;
            }
            System.out.println(dimesoes[j][i] + " ");
        }
        System.out.println();
    }
}
