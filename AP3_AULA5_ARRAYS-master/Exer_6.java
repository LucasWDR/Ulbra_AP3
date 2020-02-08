public class Exer_6 {
    public static void main(String[] args) {
        String[] mes = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
            int sorteio;
            int i;
            for (i = 0; i < 12; i++) {

                 sorteio= (int) (Math.random() * 11);

             sorteio = mes[i];
        }
        System.out.println("o mes:"+mes[i]);
    }
}
