package Exercicios;

/**
 * Classe abstrata Exercicio3Transporte representa um meio de transporte genérico.
 * Contém atributos comuns a todos os tipos de transporte e métodos abstratos para mover e parar.
 */
public abstract class Exercicio3Transporte {
    protected int capacidade;
    protected int velocidadeMaxima;

    public Exercicio3Transporte(int capacidade, int velocidadeMaxima) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /**
     * Método abstrato para mover o transporte.
     * Deve ser implementado pelas subclasses para definir o comportamento de movimento.
     */
    public abstract void mover();

    /**
     * Método abstrato para parar o transporte.
     * Deve ser implementado pelas subclasses para definir o comportamento de parada.
     */
    public abstract void parar();
}
