package Exercicios;

public class Exercicio2Revista extends Exercicio2Publicacao implements Exercicio2Reservavel {

    private boolean emprestada;

    public Exercicio2Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.emprestada = false;
    }

    @Override
    public void emprestar() {
        if (!emprestada) {
            emprestada = true;
            System.out.println("A revista '" + titulo + "' foi emprestada.");
        } else {
            System.out.println("A revista '" + titulo + "' já está emprestada.");
        }
    }

    @Override
    public void devolver() {
        if (emprestada) {
            emprestada = false;
            System.out.println("A revista '" + titulo + "' foi devolvida.");
        } else {
            System.out.println("A revista '" + titulo + "' não estava emprestada.");
        }
    }

    @Override
    public void reservar() {
        System.out.println("A revista '" + titulo + "' foi reservada.");
    }
}
