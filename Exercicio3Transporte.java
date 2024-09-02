package Exercicios;

public abstract class Exercicio3Transporte {
    protected int capacidade;
    protected int velocidadeMaxima;

    public Exercicio3Transporte(int capacidade, int velocidadeMaxima) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public abstract void mover();

    public abstract void parar();
}
