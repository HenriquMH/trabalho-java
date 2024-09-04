package Exercicios;

/**
 * Classe abstrata Exercicio6Veiculo representa um veículo genérico.
 * Contém atributos comuns a todos os veículos e métodos abstratos para ligar, desligar e acelerar.
 */
public abstract class Exercicio6Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Exercicio6Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    /**
     * Método abstrato para ligar o veículo.
     * Deve ser implementado pelas subclasses para definir o comportamento de ligar.
     */
    public abstract void ligar();

    /**
     * Método abstrato para desligar o veículo.
     * Deve ser implementado pelas subclasses para definir o comportamento de desligar.
     */
    public abstract void desligar();

    /**
     * Método abstrato para acelerar o veículo.
     * Deve ser implementado pelas subclasses para definir o comportamento de aceleração.
     */
    public abstract void acelerar();
}
