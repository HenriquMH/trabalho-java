package Exercicios;

/**
 * Classe Exercicio5Reptil representa um réptil no zoológico.
 * Implementa os métodos de emitir som e alimentar específicos para répteis.
 */
public class Exercicio5Reptil extends Exercicio5Animal implements Exercicio5Cuidador {

    public Exercicio5Reptil(String nome, int idade) {
        super(nome, idade, "Réptil");
    }

    /**
     * Implementa o método para emitir um som característico de répteis.
     */
    @Override
    public void emitirSom() {
        System.out.println("O réptil " + nome + " emite um som característico.");
    }

    /**
     * Implementa o método para alimentar o réptil.
     *
     * Exemplo: Répteis geralmente são alimentados com insetos ou pequenos animais.
     */
    @Override
    public void alimentar() {
        System.out.println("O réptil " + nome + " está sendo alimentado com insetos.");
    }

    /**
     * Implementa o método para cuidar do réptil.
     *
     * Exemplo: Inclui cuidados com a pele e habitat.
     */
    @Override
    public void cuidar() {
        System.out.println("Cuidando do réptil " + nome + ". Cuidados com a pele e habitat.");
    }
}
