public class Exer_3_metodos {

    public static int get_Dia(String data) {
        int dia = 0;
        if (isDate(data, "dd/mm/yyyy")) {
            String[] date = data.split("/");
            return (Integer.parseInt(date[0]));

        }
        return dia;
    }

    public static int get_Mes(String data) {
        int Mes = 0;
        if (isDate(data, "dd/mm/yyyy")) {
            String[] date = data.split("/");
            return (Integer.parseInt(date[1]));

        }
        return Mes;
    }
    public static int get_Mes(String[] data) {

        int Ano = 0;
        if (isDate(data, "dd/mm/yyyy")) {
            String[] date = data.split("/");
            return (Integer.parseInt(date[2]));

        }
        return Ano;
    }
    public static boolean isDate(String[] date, String format){
        String[]data=date.split("/");
        String[]formato=format.split("/");

        int check=0;
        int i;
        for(i=0;i<formato.length;i++){
            if(formato[i].length()==data[i].length()){
                check++;
            }
        }

        if (check==formato.length){
            return true;
        }
        return false;
    }
}
