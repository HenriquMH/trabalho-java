package Exercicios;

/**
 * Classe Exercicio8JogoDeCartas representa um jogo de cartas.
 * Implementa os métodos para iniciar, pausar e finalizar o jogo de cartas.
 */
public class Exercicio8JogoDeCartas extends Exercicio8Jogo {

    public Exercicio8JogoDeCartas(String titulo, String genero, String classificacaoEtaria) {
        super(titulo, genero, classificacaoEtaria);
    }

    /**
     * Implementa o método para iniciar o jogo de cartas.
     */
    @Override
    public void iniciar() {
        System.out.println("Iniciando o jogo de cartas: " + titulo);
    }

    /**
     * Implementa o método para pausar o jogo de cartas.
     */
    @Override
    public void pausar() {
        System.out.println("Pausando o jogo de cartas: " + titulo);
    }

    /**
     * Implementa o método para finalizar o jogo de cartas.
     */
    @Override
    public void finalizar() {
        System.out.println("Finalizando o jogo de cartas: " + titulo);
    }
}
