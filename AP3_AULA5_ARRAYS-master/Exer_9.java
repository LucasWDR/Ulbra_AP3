import java.util.Scanner;

public class Exer_9 {
    public static void main(String[] args) {
        String[] estac = new String[10];
        int escolha, local;
        char resp;
        Scanner tc = new Scanner(System.in);
        do {
            System.out.println("Escolha as opçoes: ");
            System.out.println("1-Entrada");
            System.out.println("2-Saida");
            System.out.println("3-Lista da situação atual");
            System.out.println("4-Encerrar progama");
            escolha = tc.nextInt();
            switch (escolha){


                    case 1:
                        System.out.println("Número da vaga: ");
                        local = tc.nextInt();
                        local--;
                        if (estac[local] != null) {
                            System.out.println("Essa vaga já possui um veículo: " + estac[local]);
                            System.out.println("Deseja sobrepor o veículo (S/N)? ");
                            resp = tc.next().toUpperCase().charAt(0);

                            if (resp == 'N') {
                                break;
                            }
                        }

                        System.out.println("Placa do veículo: ");
                        estac[local] = tc.next();
                        break;

                    case 2:
                        System.out.println("Número da vaga a ser liberada: ");
                        local = tc.nextInt();
                        local--;
                        estac[local] = null;
                        System.out.println("Vaga liberada!");
                        break;

                    case 3:
                        for (int i=0; i<10; i++) {
                            System.out.println("Vaga " + (i + 1) + ": " + estac[i]);
                        }
                        break;

                    default:
                        System.out.println("Programa encerrado!");
                        break;

                }
        } while (escolha != 4);
    }
}
