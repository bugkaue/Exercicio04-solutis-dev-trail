package br.com.solutis.exercicios.animais.terrestres;

import br.com.solutis.exercicios.abstratas.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {
    public Cachorro(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Cachorro", idade, habitat, 4, altura, peso);
    }
    @Override
    public void comer(int qtd) {
        comidaIngerida += qtd;
    }

    @Override
    public void mover(double distancia) {
        distanciaTotal += distancia;
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
    }
}
