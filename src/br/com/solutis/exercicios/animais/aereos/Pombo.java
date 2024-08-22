package br.com.solutis.exercicios.animais.aereos;

public class Pombo extends AnimalVoadorAB {
    private int quantidadeComida;
    private int distanciaPercorrida;
    private int horasDormidas;

    public Pombo(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Pombo", idade, habitat, 2, 2, 0.5, altura, peso);
    }

    @Override
    public void comer(int quantidade) {
        quantidadeComida += quantidade;
    }

    @Override
    public void mover(int distancia) {
        voar(distancia);
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
    }

    @Override
    public void voar(int distancia) {
        distanciaPercorrida += distancia;
    }
}