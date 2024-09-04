package Exercicios;

/**
 * Classe Exercicio3Bicicleta representa uma bicicleta.
 * Implementa os métodos de mover e parar específicos para bicicletas.
 */
public class Exercicio3Bicicleta extends Exercicio3Transporte {

    public Exercicio3Bicicleta(int capacidade, int velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    /**
     * Implementa o método para mover a bicicleta.
     * Simula o movimento de uma bicicleta.
     */
    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo a uma velocidade de " + velocidadeMaxima + " km/h.");
    }

    /**
     * Implementa o método para parar a bicicleta.
     * Simula a parada de uma bicicleta.
     */
    @Override
    public void parar() {
        System.out.println("A bicicleta parou.");
    }
}
