package br.com.solutis.exercicios.animais.terrestres;

import br.com.solutis.exercicios.abstratas.AnimalAB;

public abstract class AnimalTerrestreAB extends AnimalAB {
    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, int quantidadeAsas, double envergaduraAsas, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, quantidadePatas, quantidadeAsas, envergaduraAsas, altura, peso);
    }
}