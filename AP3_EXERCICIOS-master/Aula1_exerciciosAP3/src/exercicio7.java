import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        String loginusuario =new String();
        String senhausuario = new String();
        int x;

        Scanner tc = new Scanner(System.in);

        for (x = 0; x < 3; x++) {
            System.out.println("Digite o Usuario:");
            loginusuario = tc.next();

            System.out.println("Digite a senha:");
            senhausuario = tc.next();

            if (loginusuario.intern() == "java8" && senhausuario.intern() == "java8") {
                System.out.println("Acesso foi autorizado!");
            } else {
                System.out.println("Acesso Negado!");
                System.out.println("Restam" + (x + 2) + "tentativas");

            }

        }
    }
}
