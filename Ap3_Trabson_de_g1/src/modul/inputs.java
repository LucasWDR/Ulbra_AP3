package modul;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class inputs {
    Scanner teclado = new Scanner(System.in);

    public int lerInt() {
        System.out.println("Digite um inteiro ");
        return teclado.nextInt();
    }

    public int showInt(String msg) {
        System.out.println(msg);

        return teclado.nextInt();
    }

    public char lerChar() {
        System.out.println("Digite um char ");

        return teclado.next().charAt(0);
    }

    public char showChar(String msg) {
        System.out.println(msg);

        return teclado.next().charAt(0);
    }

    public float lerFloat() {
        System.out.println("Digite um float ");

        return teclado.nextFloat();
    }

    public float showFloat(String msg) {
        System.out.println(msg);

        return teclado.nextFloat();
    }

    public double lerDouble() {
        System.out.println("Digite um double ");

        return teclado.nextDouble();
    }

    public double showDouble(String msg) {
        System.out.println(msg);

        return teclado.nextDouble();
    }

    public String lerString() {
        System.out.println("Digite uma String ");

        return teclado.next();

    }

    public String showString(String msg) {
        System.out.println(msg);

        return teclado.next();
    }

    public String Leitura_email() {
        String email;
        boolean validar;

        System.out.println("Digite seu email");
        email = teclado.next();
        validar = email.matches(".*@.*");

        if (validar == true) {
            return email;
        } else
            return null;
    }

    public String Leitura_tel() {
        String tel;
        boolean validar;
        String val = "\\d\\d-\\d\\d\\d\\d\\d\\d\\d\\d\\d";

        System.out.println("Digite seu Telefone (xx-xxxxxxxx)");
        tel = teclado.next();
        validar = tel.matches(val);

        if (validar == true) {
            return tel;
        } else
            System.out.println("falta algum numero");
        return null;
    }

    public String Leitura_Date() {
        String data;
        boolean valid;
        String date = "\\d\\d/\\d\\d/\\d\\d\\d\\d";

        System.out.println("Digite uma data (dd/mm/aaaa)");
        data = teclado.next();
        valid = data.matches(date);
        if (valid == true) {
            return data;
        } else
            System.out.println("A data está incorreta!");

        return null;

    }

    public String Date_troca() {
        Scanner tc = new Scanner(System.in);
        String data1;
        System.out.println("Digite uma data:dd/MM/yyyy");
        data1 = tc.next();

        LocalDate data = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        data1 = data.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        return data1;
    }

    public static int valid_Numero() {
        boolean valid = true;
        int num = 0;
        Scanner teclado= new Scanner(System.in);
        do {
            System.out.println("Digite um valor: ");
            try {
                num = Integer.parseInt(teclado.nextLine());
                return (num);
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas Numeros!");
                valid = false;
            }
        } while (valid != true);
        return (num);
    }

}