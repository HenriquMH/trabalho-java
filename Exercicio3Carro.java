package Exercicios;

/**
 * Classe Exercicio3Carro representa um carro.
 * Implementa os métodos de mover, parar e abastecer específicos para carros.
 */
public class Exercicio3Carro extends Exercicio3Transporte implements Exercicio3Combustivel {

    public Exercicio3Carro(int capacidade, int velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    /**
     * Implementa o método para mover o carro.
     * Simula o movimento de um carro.
     */
    @Override
    public void mover() {
        System.out.println("O carro está se movendo a uma velocidade de " + velocidadeMaxima + " km/h.");
    }

    /**
     * Implementa o método para parar o carro.
     * Simula a parada de um carro.
     */
    @Override
    public void parar() {
        System.out.println("O carro parou.");
    }

    /**
     * Implementa o método para abastecer o carro.
     * Simula o abastecimento de um carro com combustível.
     */
    @Override
    public void abastecer() {
        System.out.println("O carro foi abastecido.");
    }
}
