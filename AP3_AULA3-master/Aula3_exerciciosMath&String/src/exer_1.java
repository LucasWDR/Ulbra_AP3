public class exer_1 {
    public static void main(String[] args) {
        int i, soma = 0;

        for(i=0;i<3;i++){

            int sorteio =(int) (Math.random()*6+1);
            System.out.println(sorteio);
            soma=soma+sorteio;
        }
        System.out.println("O valor é"+soma);
    }
}
