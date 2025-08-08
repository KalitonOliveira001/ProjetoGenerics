package generics;

public class Peugeot extends Carro {
    public Peugeot(String nome) {
        super(nome);
    }

    @Override
    public void acelerar() {
        System.out.println(getNome() + " acelerou de 0 a 100 km/h em 9 segundos!");
    }
}
