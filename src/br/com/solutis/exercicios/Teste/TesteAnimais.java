package br.com.solutis.exercicios.Teste;

import br.com.solutis.exercicios.animais.aereos.Pombo;
import br.com.solutis.exercicios.animais.aquaticos.Peixe;
import br.com.solutis.exercicios.animais.terrestres.Cachorro;
import br.com.solutis.exercicios.animais.terrestres.Elefante;
import br.com.solutis.exercicios.animais.terrestres.Gato;
import br.com.solutis.exercicios.animais.terrestres.Leao;

public class TesteAnimais {
    public static void main(String[] args) {
        // Criação dos animais
        Cachorro cachorro = new Cachorro("Rex", 5, "Quintal", 0.6, 20.0);
        Elefante elefante = new Elefante("Dumbo", 10, "Selva", 3.0, 5000.0);
        Gato gato = new Gato("Mimi", 3, "Casa", 0.3, 4.0);
        Leao leao = new Leao("Simba", 7, "Savanna", 1.2, 190.0);
        Peixe peixe = new Peixe("Nemo", 2, "Recife", 0.3, 1.0);
        Pombo pombo = new Pombo("Pippo", 1, "Cidade", 0.5, 0.3, 0.5);

        // Testes com Cachorro
        cachorro.comer(10);
        cachorro.mover(5);
        cachorro.dormir(8);
        System.out.println("Cachorro - Comida ingerida: " + cachorro.getComidaIngerida() +
                ", Distância total: " + cachorro.getDistanciaTotal() +
                ", Horas dormidas: " + cachorro.getHorasDormidas());

        // Testes com Elefante
        elefante.comer(50);
        elefante.mover(10);
        elefante.dormir(12);
        System.out.println("Elefante - Comida ingerida: " + elefante.getComidaIngerida() +
                ", Distância total: " + elefante.getDistanciaTotal() +
                ", Horas dormidas: " + elefante.getHorasDormidas());

        // Testes com Gato
        gato.comer(5);
        gato.mover(2);
        gato.dormir(6);
        System.out.println("Gato - Comida ingerida: " + gato.getComidaIngerida() +
                ", Distância total: " + gato.getDistanciaTotal() +
                ", Horas dormidas: " + gato.getHorasDormidas());

        // Testes com Leão
        leao.comer(30);
        leao.mover(7);
        leao.dormir(10);
        System.out.println("Leão - Comida ingerida: " + leao.getComidaIngerida() +
                ", Distância total: " + leao.getDistanciaTotal() +
                ", Horas dormidas: " + leao.getHorasDormidas());

        // Testes com Peixe
        peixe.comer(3);
        peixe.mover(4);  // Testa nadar
        peixe.dormir(5);
        System.out.println("Peixe - Comida ingerida: " + peixe.getComidaIngerida() +
                ", Distância nadada: " + peixe.getDistanciaTotal() +
                ", Horas dormidas: " + peixe.getHorasDormidas());

        // Testes com Pombo
        pombo.comer(2);
        pombo.mover(10); // Testa voar
        pombo.dormir(4);
        System.out.println("Pombo - Comida ingerida: " + pombo.getComidaIngerida() +
                ", Distância voada: " + pombo.getDistanciaTotal() +
                ", Horas dormidas: " + pombo.getHorasDormidas());
    }
}
