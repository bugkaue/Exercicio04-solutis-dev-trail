package br.com.solutis.exercicios.animais.aquaticos;

import br.com.solutis.exercicios.abstratas.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {
    public Peixe(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Peixe", idade, habitat, altura, peso);
    }
    @Override
    public void comer(int quantidade) {
        comidaIngerida += quantidade;
    }

    @Override
    public void mover(double distancia) {
        nadar(distancia);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
    }

    @Override
    public void nadar(double distancia) {
        distanciaTotal += distancia;
    }
}