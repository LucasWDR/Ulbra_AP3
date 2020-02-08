public class Exer_2_metodos {
    private static void contar() {
        int i;

        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }

    private  static void contar(int fim) {
        int i;

        for (i = 1; i <= fim; i++) {
            System.out.println(i);
        }

    }

    private static void contar(int fim, int incio) {
        int i;

        for (i = incio; i <= fim; i++) {
            System.out.println(i);
        }

    }

    private static void contar(int fim, int incio, int pausa) {
        int i;

        for (i = incio; i <= fim; i++) {
            System.out.println(i + " ");
            try {
                Thread.sleep(pausa * 500);


            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }


    }

    public static void main(String[] args) {
        Exer_2_metodos.contar();
        Exer_2_metodos.contar(5);
        Exer_2_metodos.contar(6, 14);
        Exer_2_metodos.contar(2, 8, 9);
    }


}
