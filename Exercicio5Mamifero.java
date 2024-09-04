package Exercicios;

/**
 * Classe Exercicio5Mamifero representa um mamífero no zoológico.
 * Implementa os métodos de emitir som e alimentar específicos para mamíferos.
 */
public class Exercicio5Mamifero extends Exercicio5Animal implements Exercicio5Cuidador {

    public Exercicio5Mamifero(String nome, int idade) {
        super(nome, idade, "Mamífero");
    }

    /**
     * Implementa o método para emitir um som característico de mamíferos.
     */
    @Override
    public void emitirSom() {
        System.out.println("O mamífero " + nome + " faz um som característico.");
    }

    /**
     * Implementa o método para alimentar o mamífero.
     *
     * Exemplo: Mamíferos geralmente são alimentados com carne ou vegetais.
     */
    @Override
    public void alimentar() {
        System.out.println("O mamífero " + nome + " está sendo alimentado com comida adequada.");
    }

    /**
     * Implementa o método para cuidar do mamífero.
     *
     * Exemplo: Inclui verificações de saúde e higiene.
     */
    @Override
    public void cuidar() {
        System.out.println("Cuidando do mamífero " + nome + ". Verificação de saúde e higiene.");
    }
}
