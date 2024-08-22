package br.com.solutis.exercicios.animais.aquaticos;

public class Peixe extends AnimalMarinhoAB {
    private int quantidadeComida;
    private int distanciaPercorrida;
    private int horasDormidas;

    public Peixe(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Peixe", idade, habitat, 0, 0, 0, altura, peso);
    }

    @Override
    public void comer(int quantidade) {
        quantidadeComida += quantidade;
    }

    @Override
    public void mover(int distancia) {
        nadar(distancia);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
    }

    @Override
    public void nadar(int distancia) {
        distanciaPercorrida += distancia;
    }
}