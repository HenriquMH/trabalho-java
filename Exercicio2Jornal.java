package Exercicios;

/**
 * Classe Exercicio2Jornal representa um jornal na biblioteca.
 * Implementa os métodos de emprestar, devolver e reservar específicos para jornais.
 */
public class Exercicio2Jornal extends Exercicio2Publicacao implements Exercicio2Reservavel {

    private boolean emprestado;

    public Exercicio2Jornal(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.emprestado = false;
    }

    /**
     * Implementa o método para emprestar o jornal.
     * Marca o jornal como emprestado se não estiver emprestado.
     */
    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("O jornal '" + titulo + "' foi emprestado.");
        } else {
            System.out.println("O jornal '" + titulo + "' já está emprestado.");
        }
    }

    /**
     * Implementa o método para devolver o jornal.
     * Marca o jornal como disponível se estiver emprestado.
     */
    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O jornal '" + titulo + "' foi devolvido.");
        } else {
            System.out.println("O jornal '" + titulo + "' não estava emprestado.");
        }
    }

    /**
     * Implementa o método para reservar o jornal.
     * Indica que a reserva foi realizada.
     */
    @Override
    public void reservar() {
        System.out.println("O jornal '" + titulo + "' foi reservado.");
    }
}
