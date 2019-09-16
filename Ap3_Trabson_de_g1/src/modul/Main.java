package modul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        modul.inputs var= new modul.inputs();

        System.out.println(var.lerInt());
        System.out.println(var.showInt("mensagem por parametro retorna inteiro"));


        System.out.println(var.lerChar());
        System.out.println(var.showChar("mensagem por parametro retorna um char"));



        System.out.println(var.lerFloat());
        System.out.println(var.showFloat("mensagem por parametro retorna um float"));



        System.out.println(var.lerDouble());
        System.out.println(var.showDouble("mensagem por parametro retorna um double"));



        System.out.println(var.lerString());
        System.out.println(var.showString("mensagem por parametro retorna uma string"));



        System.out.println(var.Leitura_email());

        System.out.println(var.Leitura_tel());

        System.out.println(var.Leitura_Date());

        System.out.println(var.Date_troca());

        System.out.println(var.valid_Numero());

    }
}