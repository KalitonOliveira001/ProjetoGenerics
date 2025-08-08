package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista que pode guardar QUALQUER tipo de Carro
        List<Carro> listaDeCarros = new ArrayList<>();

        // Adicionando carros diferentes
        listaDeCarros.add(new Honda("Honda Civic"));
        listaDeCarros.add(new Ford("Ford Mustang"));
        listaDeCarros.add(new Peugeot("Peugeot 208"));

        // Fazendo todos acelerarem
        for (Carro carro : listaDeCarros) {
            carro.acelerar();
        }
    }
}

