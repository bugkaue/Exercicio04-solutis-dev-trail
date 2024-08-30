package br.com.solutis.exercicios.abstratas;

public abstract class AnimalMarinhoAB extends AnimalAB {
    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, 0, altura, peso);
    }
    // Método especifico para animais marinhos
    public abstract void nadar(double distancia);

}