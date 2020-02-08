public class Cliente {

    int nUnico;

    int idade;
    String nome;
    String cpf;
    String dataNasc;

    String agencia;
    double limiteSaldo;
    double saldo;
    double transferir;

    @Override
    public String toString() {
        return "Cliente{" +
                "numero da conta= "+ nUnico +'\''+
                "idade= " + idade +'\''+
                ", nome= " + nome + '\'' +
                ", cpf= " + cpf + '\'' +
                ", dataNasc= " + dataNasc + '\'' +
                ", agencia= " + agencia + '\'' +
                ", limite Saldo= " + limiteSaldo +
                ", saldo= " + saldo +
                '}';
    }

}
