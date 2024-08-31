package br.com.solutis.exercicios.animais.aereos;

import br.com.solutis.exercicios.abstratas.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {
    public Pombo(String nome, int idade, String habitat, double envergaduraAssa, double altura, double peso) {
        super(nome, "Pombo", idade, habitat, 2, envergaduraAssa, altura, peso);
    }
    @Override
    public void comer(int quantidade) {
        comidaIngerida += quantidade;
    }
    @Override
    public void mover(double distancia) {
        voar(distancia);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
    }

    @Override
    public void voar(double distancia) {
        distanciaTotal += distancia;
    }
}