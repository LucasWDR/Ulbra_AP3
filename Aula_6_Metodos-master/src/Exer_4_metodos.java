import java.util.Random;
public class Exer_4_metodos {

        public static void gerar() {
            String pass = " ";
            Random aleatorio = new Random();
            int num = 0, i;
            for (i = 0; i < 8; i++) {
                num = aleatorio.nextInt(9);
                pass += num;
            }

        }
        return pass;

    }

