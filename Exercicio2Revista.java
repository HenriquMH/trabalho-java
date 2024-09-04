package Exercicios;

/**
 * Classe Exercicio2Revista representa uma revista na biblioteca.
 * Implementa os métodos de emprestar, devolver e reservar específicos para revistas.
 */
public class Exercicio2Revista extends Exercicio2Publicacao implements Exercicio2Reservavel {

    private boolean emprestada;

    public Exercicio2Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.emprestada = false;
    }

    /**
     * Implementa o método para emprestar a revista.
     * Marca a revista como emprestada se não estiver emprestada.
     */
    @Override
    public void emprestar() {
        if (!emprestada) {
            emprestada = true;
            System.out.println("A revista '" + titulo + "' foi emprestada.");
        } else {
            System.out.println("A revista '" + titulo + "' já está emprestada.");
        }
    }

    /**
     * Implementa o método para devolver a revista.
     * Marca a revista como disponível se estiver emprestada.
     */
    @Override
    public void devolver() {
        if (emprestada) {
            emprestada = false;
            System.out.println("A revista '" + titulo + "' foi devolvida.");
        } else {
            System.out.println("A revista '" + titulo + "' não estava emprestada.");
        }
    }

    /**
     * Implementa o método para reservar a revista.
     * Indica que a reserva foi realizada.
     */
    @Override
    public void reservar() {
        System.out.println("A revista '" + titulo + "' foi reservada.");
    }
}
