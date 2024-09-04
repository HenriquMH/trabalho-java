package Exercicios;

/**
 * Classe abstrata Exercicio2Publicacao representa uma publicação na biblioteca.
 * Contém atributos comuns a todas as publicações e métodos abstratos para emprestar e devolver.
 */
public abstract class Exercicio2Publicacao {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    public Exercicio2Publicacao(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    /**
     * Método abstrato para emprestar a publicação.
     * Deve ser implementado pelas subclasses para definir o comportamento de empréstimo.
     */
    public abstract void emprestar();

    /**
     * Método abstrato para devolver a publicação.
     * Deve ser implementado pelas subclasses para definir o comportamento de devolução.
     */
    public abstract void devolver();
}
