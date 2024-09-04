package Exercicios;

/**
 * Classe Exercicio8JogoDeTabuleiro representa um jogo de tabuleiro.
 * Implementa os métodos para iniciar, pausar e finalizar o jogo de tabuleiro.
 */
public class Exercicio8JogoDeTabuleiro extends Exercicio8Jogo {

    public Exercicio8JogoDeTabuleiro(String titulo, String genero, String classificacaoEtaria) {
        super(titulo, genero, classificacaoEtaria);
    }

    /**
     * Implementa o método para iniciar o jogo de tabuleiro.
     */
    @Override
    public void iniciar() {
        System.out.println("Iniciando o jogo de tabuleiro: " + titulo);
    }

    /**
     * Implementa o método para pausar o jogo de tabuleiro.
     */
    @Override
    public void pausar() {
        System.out.println("Pausando o jogo de tabuleiro: " + titulo);
    }

    /**
     * Implementa o método para finalizar o jogo de tabuleiro.
     */
    @Override
    public void finalizar() {
        System.out.println("Finalizando o jogo de tabuleiro: " + titulo);
    }
}
