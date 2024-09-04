package Exercicios;

/**
 * Classe Exercicio7ProdutoDigital representa um produto digital no e-commerce.
 * Implementa os métodos para calcular o preço final e exibir detalhes específicos de produtos digitais.
 */
public class Exercicio7ProdutoDigital extends Exercicio7Produto implements Exercicio7Promocao {

    public Exercicio7ProdutoDigital(String nome, double preco, String categoria) {
        super(nome, preco, categoria);
    }

    /**
     * Implementa o método para calcular o preço final do produto digital.
     *
     * @return preço final do produto
     */
    @Override
    public double calcularPrecoFinal() {
        // Exemplo simples: preço final é o mesmo preço do produto digital
        return preco;
    }

    /**
     * Implementa o método para exibir os detalhes do produto digital.
     */
    @Override
    public void exibirDetalhes() {
        System.out.println("Produto Digital:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Categoria: " + categoria);
    }

    /**
     * Implementa o método para aplicar promoção ao produto digital.
     *
     * @return valor do desconto aplicado
     */
    @Override
    public double aplicarPromocao() {
        // Exemplo: aplica um desconto fixo de 20%
        return preco * 0.20;
    }
}
