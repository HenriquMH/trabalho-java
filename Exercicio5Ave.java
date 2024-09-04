package Exercicios;

/**
 * Classe Exercicio5Ave representa uma ave no zoológico.
 * Implementa os métodos de emitir som e alimentar específicos para aves.
 */
public class Exercicio5Ave extends Exercicio5Animal implements Exercicio5Cuidador {

    public Exercicio5Ave(String nome, int idade) {
        super(nome, idade, "Ave");
    }

    /**
     * Implementa o método para emitir um som característico de aves.
     */
    @Override
    public void emitirSom() {
        System.out.println("A ave " + nome + " canta.");
    }

    /**
     * Implementa o método para alimentar a ave.
     *
     * Exemplo: Aves geralmente são alimentadas com sementes e frutas.
     */
    @Override
    public void alimentar() {
        System.out.println("A ave " + nome + " está sendo alimentada com sementes e frutas.");
    }

    /**
     * Implementa o método para cuidar da ave.
     *
     * Exemplo: Inclui verificação de plumagem e saúde.
     */
    @Override
    public void cuidar() {
        System.out.println("Cuidando da ave " + nome + ". Verificação de plumagem e saúde.");
    }
}
