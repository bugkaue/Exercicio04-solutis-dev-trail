package br.com.solutis.exercicios.animais.terrestres;

public class Leao extends AnimalTerrestreAB {
    private int quantidadeComida;
    private int distanciaPercorrida;
    private int horasDormidas;

    public Leao(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Leão", idade, habitat, 4, 0, 0, altura, peso);
    }

    @Override
    public void comer(int quantidade) {
        quantidadeComida += quantidade;
    }

    @Override
    public void mover(int distancia) {
        distanciaPercorrida += distancia;
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
    }
}
