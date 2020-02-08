public class Exer_1_metodos {

    private static String[] months = {"January", "February", "marc", "april", "may", "June", "July", "August", "September", "October", "November","December"};
    private static String[] meses = {"Janeiro", "Fevereiro", "marco", "abril", "maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    private static String Pegue_mes(int m) {

        m = m - 1;

        if (m >= 0 && m < 12) {
            return meses[m];
        } else {
            return "Este mes está invalido";

        }
    }
    private static String Pegue_months(int m) {

        m = m - 1;

        if (m >= 0 && m < 12) {
            return months[m];
        } else return "Este mes esta invalido";
    }

    private static String Mostrar_mes(int i, int m){
        if(i==1){
            return Pegue_mes(m);
        }
        if(i==2){
            return Pegue_months(m);
        }
        return"idioma indisponivel";

    }

    public static void main(String[] args) {

        System.out.println(Exer_1_metodos.Mostrar_mes(1,4));
        System.out.println(Exer_1_metodos.Mostrar_mes(2,8));
        System.out.println(Exer_1_metodos.Mostrar_mes(1,7));
        System.out.println(Exer_1_metodos.Mostrar_mes(2,6));
    }
}

