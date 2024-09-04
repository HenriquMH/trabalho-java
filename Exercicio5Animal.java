package Exercicios;

/**
 * Classe abstrata Exercicio5Animal representa um animal genérico no zoológico.
 * Contém atributos comuns a todos os tipos de animais e métodos abstratos para emitir som e alimentar.
 */
public abstract class Exercicio5Animal {
    protected String nome;
    protected int idade;
    protected String especie;

    public Exercicio5Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    /**
     * Método abstrato para emitir um som característico do animal.
     * Deve ser implementado pelas subclasses para definir o som específico.
     */
    public abstract void emitirSom();

    /**
     * Método abstrato para alimentar o animal.
     * Deve ser implementado pelas subclasses para definir a forma de alimentação.
     */
    public abstract void alimentar();
}
