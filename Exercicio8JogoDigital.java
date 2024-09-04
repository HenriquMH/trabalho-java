package Exercicios;

/**
 * Classe Exercicio8JogoDigital representa um jogo digital.
 * Implementa os métodos para iniciar, pausar e finalizar o jogo digital, além de conectar jogadores.
 */
public class Exercicio8JogoDigital extends Exercicio8Jogo implements Exercicio8Multiplayer {

    public Exercicio8JogoDigital(String titulo, String genero, String classificacaoEtaria) {
        super(titulo, genero, classificacaoEtaria);
    }

    /**
     * Implementa o método para iniciar o jogo digital.
     */
    @Override
    public void iniciar() {
        System.out.println("Iniciando o jogo digital: " + titulo);
    }

    /**
     * Implementa o método para pausar o jogo digital.
     */
    @Override
    public void pausar() {
        System.out.println("Pausando o jogo digital: " + titulo);
    }

    /**
     * Implementa o método para finalizar o jogo digital.
     */
    @Override
    public void finalizar() {
        System.out.println("Finalizando o jogo digital: " + titulo);
    }

    /**
     * Implementa o método para conectar múltiplos jogadores no jogo digital.
     */
    @Override
    public void conectarJogadores() {
        System.out.println("Conectando jogadores no jogo digital: " + titulo);
    }
}
