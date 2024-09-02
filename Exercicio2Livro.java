package Exercicios;

public class Exercicio2Livro extends Exercicio2Publicacao implements Exercicio2Reservavel {

    private boolean emprestado;

    public Exercicio2Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.emprestado = false;
    }

    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("O livro '" + titulo + "' foi emprestado.");
        } else {
            System.out.println("O livro '" + titulo + "' já está emprestado.");
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O livro '" + titulo + "' foi devolvido.");
        } else {
            System.out.println("O livro '" + titulo + "' não estava emprestado.");
        }
    }
    
    @Override
    public void reservar() {
        System.out.println("O livro '" + titulo + "' já foi reservado");
    }
}
