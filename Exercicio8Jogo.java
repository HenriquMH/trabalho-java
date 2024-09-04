package Exercicios;

/**
 * Classe abstrata Exercicio8Jogo representa um jogo genérico.
 * Contém atributos comuns a todos os jogos e métodos abstratos para iniciar, pausar e finalizar o jogo.
 */
public abstract class Exercicio8Jogo {
    protected String titulo;
    protected String genero;
    protected String classificacaoEtaria;

    public Exercicio8Jogo(String titulo, String genero, String classificacaoEtaria) {
        this.titulo = titulo;
        this.genero = genero;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    /**
     * Método abstrato para iniciar o jogo.
     * Deve ser implementado pelas subclasses para definir o comportamento ao iniciar o jogo.
     */
    public abstract void iniciar();

    /**
     * Método abstrato para pausar o jogo.
     * Deve ser implementado pelas subclasses para definir o comportamento ao pausar o jogo.
     */
    public abstract void pausar();

    /**
     * Método abstrato para finalizar o jogo.
     * Deve ser implementado pelas subclasses para definir o comportamento ao finalizar o jogo.
     */
    public abstract void finalizar();
}
