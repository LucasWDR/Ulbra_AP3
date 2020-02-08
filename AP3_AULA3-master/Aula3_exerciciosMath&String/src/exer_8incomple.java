import java.util.Scanner;

public class exer_8 {
    public static void main(String[] args) {
        double a;

        Scanner koe = new Scanner(System.in);

        System.out.println("Diigite um numero para converter:");
        a= koe.nextDouble();

        System.out.println(Math.sin(Math.toRadians(a)));
        System.out.println(Math.cos(Math.toRadians(a)));
        System.out.println(Math.tan(Math.toRadians(a)));

    }
}
