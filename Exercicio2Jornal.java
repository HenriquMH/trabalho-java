package Exercicios;

public class Exercicio2Jornal extends Exercicio2Publicacao implements Exercicio2Reservavel {

    private boolean emprestado;

    public Exercicio2Jornal(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.emprestado = false;
    }

    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("O jornal '" + titulo + "' foi emprestado.");
        } else {
            System.out.println("O jornal '" + titulo + "' já está emprestado.");
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O jornal '" + titulo + "' foi devolvido.");
        } else {
            System.out.println("O jornal '" + titulo + "' não estava emprestado.");
        }
    }

    @Override
    public void reservar() {
        System.out.println("O jornal '" + titulo + "' foi reservado.");
    }
}
