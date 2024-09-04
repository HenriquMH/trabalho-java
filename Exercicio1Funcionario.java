package Exercicios;

/**
 * Classe abstrata Exercicio1Funcionario representa um funcionário genérico.
 * A classe contém atributos comuns e um método abstrato para calcular o salário.
 */
public abstract class Exercicio1Funcionario {
    protected String nome;
    protected double salarioBase;

    public Exercicio1Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Método abstrato para calcular o salário.
     * Este método será implementado nas subclasses.
     * @return o valor do salário calculado.
     */
    public abstract double calcularSalario();
}
