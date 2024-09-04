package Exercicios;

/**
 * Classe Exercicio2Livro representa um livro na biblioteca.
 * Implementa os métodos de emprestar, devolver e reservar específicos para livros.
 */
public class Exercicio2Livro extends Exercicio2Publicacao implements Exercicio2Reservavel {

    private boolean emprestado;

    public Exercicio2Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.emprestado = false;
    }

    /**
     * Implementa o método para emprestar o livro.
     * Marca o livro como emprestado se não estiver emprestado.
     */
    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("O livro '" + titulo + "' foi emprestado.");
        } else {
            System.out.println("O livro '" + titulo + "' já está emprestado.");
        }
    }

    /**
     * Implementa o método para devolver o livro.
     * Marca o livro como disponível se estiver emprestado.
     */
    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O livro '" + titulo + "' foi devolvido.");
        } else {
            System.out.println("O livro '" + titulo + "' não estava emprestado.");
        }
    }

    /**
     * Implementa o método para reservar o livro.
     * Indica que a reserva foi realizada.
     */
    @Override
    public void reservar() {
        System.out.println("O livro '" + titulo + "' foi reservado.");
    }
}
