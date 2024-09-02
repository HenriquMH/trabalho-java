package Exercicios;

public abstract class Exercicio2Publicacao {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    public Exercicio2Publicacao(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public abstract void emprestar();

    public abstract void devolver();
}
