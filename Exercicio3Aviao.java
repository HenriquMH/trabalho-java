package Exercicios;

/**
 * Classe Exercicio3Aviao representa um avião.
 * Implementa os métodos de mover, parar e abastecer específicos para aviões.
 */
public class Exercicio3Aviao extends Exercicio3Transporte implements Exercicio3Combustivel {

    public Exercicio3Aviao(int capacidade, int velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    /**
     * Implementa o método para mover o avião.
     * Simula o movimento de um avião.
     */
    @Override
    public void mover() {
        System.out.println("O avião está voando a uma velocidade de " + velocidadeMaxima + " km/h.");
    }

    /**
     * Implementa o método para parar o avião.
     * Simula a parada de um avião.
     */
    @Override
    public void parar() {
        System.out.println("O avião aterrissou e parou.");
    }

    /**
     * Implementa o método para abastecer o avião.
     * Simula o abastecimento de um avião com combustível.
     */
    @Override
    public void abastecer() {
        System.out.println("O avião foi abastecido.");
    }
}
