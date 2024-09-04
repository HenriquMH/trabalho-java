package Exercicios;

/**
 * Classe abstrata Exercicio7Produto representa um produto genérico no e-commerce.
 * Contém atributos comuns a todos os produtos e métodos abstratos para calcular o preço final e exibir detalhes.
 */
public abstract class Exercicio7Produto {
    protected String nome;
    protected double preco;
    protected String categoria;

    public Exercicio7Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    /**
     * Método abstrato para calcular o preço final do produto.
     * Deve ser implementado pelas subclasses para definir o cálculo do preço final.
     *
     * @return preço final do produto
     */
    public abstract double calcularPrecoFinal();

    /**
     * Método abstrato para exibir os detalhes do produto.
     * Deve ser implementado pelas subclasses para exibir informações específicas do produto.
     */
    public abstract void exibirDetalhes();
}
