import java.util.Scanner;

public class Triangulo {

    Scanner tc= new Scanner(System.in);

    double altura;
    double base;

    public void leitura(){
        System.out.println("Escreva a Base:");
        base =tc.nextDouble();
        System.out.println("Escreva a Altura:");
        altura=tc.nextDouble();
    }

    public void exibicao(){
        System.out.println("base"+base);
        System.out.println("altura"+altura);
    }

    public void area(){
        double calcular;
        calcular =(base *altura)/2;
        System.out.println("Area=" +calcular);
    }

    @Override
    public String toString(){
        return "Triangulo{"+
                "altura="+altura +
                ", base="+ base+
                '}';
    }
}
