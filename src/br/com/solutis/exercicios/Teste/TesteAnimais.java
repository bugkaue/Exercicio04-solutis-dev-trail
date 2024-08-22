package br.com.solutis.exercicios.Teste;

import br.com.solutis.exercicios.animais.aereos.Pombo;
import br.com.solutis.exercicios.animais.aquaticos.Peixe;
import br.com.solutis.exercicios.animais.terrestres.Cachorro;
import br.com.solutis.exercicios.animais.terrestres.Elefante;
import br.com.solutis.exercicios.animais.terrestres.Gato;
import br.com.solutis.exercicios.animais.terrestres.Leao;

public class TesteAnimais {
    public static void main(String[] args) {
        // Criando instâncias dos animais
        Cachorro cachorro = new Cachorro("Rex", 5, "Casa", 0.6, 20.0);
        Gato gato = new Gato("Miau", 3, "Casa", 0.4, 5.0);
        Elefante elefante = new Elefante("Dumbo", 10, "Selva", 3.0, 5000.0);
        Leao leao = new Leao("Simba", 7, "Savana", 1.2, 200.0);
        Peixe peixe = new Peixe("Nemo", 2, "Oceano", 0.3, 0.5);
        Pombo pombo = new Pombo("Pippo", 4, "Cidade", 0.3, 0.4);

        // Usando os métodos de cada classe
        cachorro.comer(5);
        cachorro.mover(100);
        cachorro.dormir(8);

        gato.comer(3);
        gato.mover(50);
        gato.dormir(6);

        elefante.comer(200);
        elefante.mover(200);
        elefante.dormir(10);

        leao.comer(150);
        leao.mover(150);
        leao.dormir(12);

        peixe.comer(2);
        peixe.mover(50); // Isso chamará o método nadar
        peixe.dormir(6);

        pombo.comer(4);
        pombo.mover(200); // Isso chamará o método voar
        pombo.dormir(7);

        // Acessando e exibindo atributos dos animais usando getters
        System.out.println("Cachorro: " + cachorro.getNome() + ", Idade: " + cachorro.getIdade() + ", Habitat: " + cachorro.getHabitat());
        System.out.println("Gato: " + gato.getNome() + ", Idade: " + gato.getIdade() + ", Habitat: " + gato.getHabitat());
        System.out.println("Elefante: " + elefante.getNome() + ", Idade: " + elefante.getIdade() + ", Habitat: " + elefante.getHabitat());
        System.out.println("Leão: " + leao.getNome() + ", Idade: " + leao.getIdade() + ", Habitat: " + leao.getHabitat());
        System.out.println("Peixe: " + peixe.getNome() + ", Idade: " + peixe.getIdade() + ", Habitat: " + peixe.getHabitat());
        System.out.println("Pombo: " + pombo.getNome() + ", Idade: " + pombo.getIdade() + ", Habitat: " + pombo.getHabitat());

        // Exibindo informações adicionais
        System.out.println("Cachorro - Comida ingerida: 5, Distância percorrida: 100, Horas dormidas: 8");
        System.out.println("Gato - Comida ingerida: 3, Distância percorrida: 50, Horas dormidas: 6");
        System.out.println("Elefante - Comida ingerida: 200, Distância percorrida: 200, Horas dormidas: 10");
        System.out.println("Leão - Comida ingerida: 150, Distância percorrida: 150, Horas dormidas: 12");
        System.out.println("Peixe - Comida ingerida: 2, Distância nadada: 50, Horas dormidas: 6");
        System.out.println("Pombo - Comida ingerida: 4, Distância voada: 200, Horas dormidas: 7");
    }
}
