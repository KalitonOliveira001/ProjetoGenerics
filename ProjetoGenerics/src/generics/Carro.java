package generics;

// Classe abstrata: serve como modelo para os outros carros
public abstract class Carro {
    private String nome;

    // Construtor para dar um nome ao carro
    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Método abstrato que cada carro vai implementar do seu jeito
    public abstract void acelerar();
}

