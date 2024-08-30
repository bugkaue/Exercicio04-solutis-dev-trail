package br.com.solutis.exercicios.animais.terrestres;

import br.com.solutis.exercicios.abstratas.AnimalTerrestreAB;

public class Leao extends AnimalTerrestreAB {
    public Leao(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Leão", idade, habitat, 4, altura, peso);
    }
    @Override
    public void comer(int quantidade) {
        comidaIngerida += quantidade;
    }

    @Override
    public void moverse(double distancia) {
        distanciaTotal += distancia;
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
    }
}
