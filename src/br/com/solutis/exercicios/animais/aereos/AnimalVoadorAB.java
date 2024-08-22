package br.com.solutis.exercicios.animais.aereos;

import br.com.solutis.exercicios.abstratas.AnimalAB;

public abstract class AnimalVoadorAB extends AnimalAB {
    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, int quantidadeAsas, double envergaduraAsas, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, quantidadePatas, quantidadeAsas, envergaduraAsas, altura, peso);
    }
    // Metodo para animais voadores.
    public abstract void voar(int distancia);
}