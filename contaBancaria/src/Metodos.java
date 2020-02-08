import java.util.Random;
import java.util.Scanner;

public class Metodos {
    Scanner tc = new Scanner(System.in);

    private double saque;
    private double deposito;


    Cliente cliente = new Cliente();

    public void Titular(){
        cliente.idade = lerIdade();
        if (cliente.idade < 16){
            System.out.println("voce ainda nao pode criar uma conta");
            return;
        }
        cliente.nUnico = nUnico();
        cliente.nome = lerNome();
        cliente.cpf = lerCpf();
        cliente.dataNasc = lerDataNasc();
        cliente.agencia = lerAgencia();
        cliente.limiteSaldo = lerLimiteSaldo();
        cliente.saldo = lerSaldo();
    }

    public double Saque(){

        System.out.println("Digite a quantidade que queira retirar:");
        saque = tc.nextDouble();

        if (cliente.saldo < saque){
            System.out.println("saudo insuficiente");
            return cliente.saldo;
        }else{
            cliente.saldo = cliente.saldo - saque;
            System.out.println("saque efetuado!");
        }
        return cliente.saldo;
    }

    public double Deposito(){


        System.out.println("Digite a quantidade que deseja depositar");
        deposito = tc.nextDouble();

        if (deposito <= cliente.limiteSaldo){
            cliente.saldo = deposito;
            System.out.println("Deposito concluido");
        }else{
            System.out.println("limite excedido");
        }
        return cliente.saldo;
    }

    public double Saldo(){
        System.out.println("Saldo atual: "+cliente.saldo);
        return cliente.saldo;
    }

    public double Extrato(){
        System.out.println("Extrato");

        System.out.println("Deposito: "+ deposito);
        System.out.println("Retirada: "+ saque);
        System.out.println("Disponivel: "+ cliente.saldo);
        return cliente.saldo;
    }

    public double Transferir(){
        System.out.println("Digite a quantidade que queira transferir:");
        cliente.transferir = tc.nextDouble();

        if (cliente.transferir > cliente.saldo){
            System.out.println("saldo insuficiente");
            return Transferir();
        }else{
            cliente.saldo = cliente.saldo - cliente.transferir;
            System.out.println("transação concluida");
            return cliente.transferir;
        }
    }

    public double TransferirValor(double a){
        cliente.saldo = a + cliente.saldo;
        return cliente.saldo;
    }

    private String lerNome(){
        System.out.println("Digite seu nome:");
        cliente.nome = tc.next();
        return cliente.nome;
    }

    private String lerCpf(){
        boolean validar;
        String date = "[0-9]{3}.[0-9]{3}.[0-9]{3}.[0-9]{2}";

        System.out.println("Digite seu cpf Ex: 123.456.789-10 ");
        cliente.cpf = tc.next();
        validar = cliente.cpf.matches(date);
        if (validar == true){
            return cliente.cpf;
        }else
            System.out.println("Cpf inválido, tente novamente");
        return lerCpf();
    }

    private int lerIdade() {
        boolean valida = true;
        Scanner tc = new Scanner(System.in);
        do {
            System.out.println("Digite sua idade:");
            try {
                cliente.idade = Integer.parseInt(tc.nextLine());
                return (cliente.idade);
            } catch (NumberFormatException e) {
                System.out.println("Digite um numero válido!");
                valida = false;
            }
        } while (valida != true);
        return cliente.idade;
    }

    private String lerDataNasc(){

        boolean validar;
        String date = "[01-31]{2}.[01-12]{2}.[0000-2019]{4}";

        System.out.println("Digite sua data de nascimento Ex: 00/11/1111 ");
        cliente.dataNasc = tc.next();
        validar = cliente.dataNasc.matches(date);
        if (validar == true){
            return cliente.dataNasc;
        }else
            System.out.println("data inválida, tente novamente");
        return lerDataNasc();
    }

    private String lerAgencia(){
        System.out.println("Digite sua agencia");
        cliente.agencia = tc.next();
        return cliente.agencia;
    }

    private double lerLimiteSaldo(){
        if (cliente.idade >= 16 && cliente.idade <= 18 ){
            cliente.limiteSaldo = 100;
        }else if (cliente.idade > 18 && cliente.idade < 60 ){
            cliente.limiteSaldo = 300;
        }else{
            cliente.limiteSaldo = 1000;
        }
        return cliente.limiteSaldo;
    }

    private double lerSaldo(){
        if (cliente.limiteSaldo > 0){
            cliente.saldo = 0;
        }
        return cliente.saldo;
    }

    int nUnico(){
        cliente.nUnico = (int) (Math.random()*100000);
        return cliente.nUnico;
    }


}
