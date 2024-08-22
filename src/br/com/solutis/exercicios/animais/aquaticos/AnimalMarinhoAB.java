package br.com.solutis.exercicios.animais.aquaticos;

import br.com.solutis.exercicios.abstratas.AnimalAB;

public abstract class AnimalMarinhoAB extends AnimalAB {
    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, int quantidadeAsas, double envergaduraAsas, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, quantidadePatas, quantidadeAsas, envergaduraAsas, altura, peso);
    }

    // Metodo específico para animais marinhos
    public abstract void nadar(int distancia);
}