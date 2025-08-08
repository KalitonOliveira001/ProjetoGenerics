package generics;

public class Honda extends Carro {
    public Honda(String nome) {
        super(nome); // manda o nome para a classe Carro
    }

    @Override
    public void acelerar() {
        System.out.println(getNome() + " acelerou de 0 a 100 km/h em 8 segundos!");
    }
}

