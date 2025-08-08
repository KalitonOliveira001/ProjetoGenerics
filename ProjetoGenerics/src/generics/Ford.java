package generics;

public class Ford extends Carro {
    public Ford(String nome) {
        super(nome);
    }

    @Override
    public void acelerar() {
        System.out.println(getNome() + " acelerou de 0 a 100 km/h em 7 segundos!");
    }
}

