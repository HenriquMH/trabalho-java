package Exercicios;

/**
 * Classe Exercicio7ProdutoFisico representa um produto físico no e-commerce.
 * Implementa os métodos para calcular o preço final e exibir detalhes específicos de produtos físicos.
 */
public class Exercicio7ProdutoFisico extends Exercicio7Produto implements Exercicio7Promocao {

    public Exercicio7ProdutoFisico(String nome, double preco, String categoria) {
        super(nome, preco, categoria);
    }

    /**
     * Implementa o método para calcular o preço final do produto físico.
     *
     * @return preço final do produto
     */
    @Override
    public double calcularPrecoFinal() {
        // Exemplo simples: preço final é o mesmo preço do produto físico
        return preco;
    }

    /**
     * Implementa o método para exibir os detalhes do produto físico.
     */
    @Override
    public void exibirDetalhes() {
        System.out.println("Produto Físico:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Categoria: " + categoria);
    }

    /**
     * Implementa o método para aplicar promoção ao produto físico.
     *
     * @return valor do desconto aplicado
     */
    @Override
    public double aplicarPromocao() {
        // Exemplo: aplica um desconto fixo de 10%
        return preco * 0.10;
    }
}
