public class Main {
    public static void main(String[] args) {

        double transferir;

        Metodos cl = new Metodos();
        Metodos cl1 = new Metodos();

        System.out.println("conta1");
        //cadastro
        cl.Titular();
        //deposito
        cl.Deposito();
        //saque
        cl.Saque();
        //saldo
        cl.Saldo();
        cl.Extrato();

        System.out.println("conta2");
        //cadastro
        cl1.Titular();
        //deposito
        cl1.Deposito();
        //saque
        cl1.Saque();
        //saldo
        cl1.Saldo();
        cl1.Extrato();

        //transfere da conta cl1 para a cl

        //diminui da conta cl1
        transferir = cl1.Transferir();

        // valor diminuido da cl1 é acrescentado na cll
        cl.TransferirValor(transferir);

        //printa os detalhes da conta
        System.out.println(cl1.cliente);
        System.out.println(cl.cliente);

    }

}
