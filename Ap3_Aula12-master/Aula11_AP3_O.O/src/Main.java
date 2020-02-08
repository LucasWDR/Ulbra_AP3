public class Main {
    public static void main(String[] args) {
        pokemon poke=new pokemon();
        poke.nome="Pikachu";
        poke.level=1;
        poke.nome="Eletrico";
        poke.peso=23.00;
        poke.atacar();
        poke.defender();
        poke.Aumentardexp();
        System.out.println(poke);



    }
}
