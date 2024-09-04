package Exercicios;

/**
 * Classe Exercicio7ProdutoServico representa um serviço no e-commerce.
 * Implementa os métodos para calcular o preço final e exibir detalhes específicos de serviços.
 */
public class Exercicio7ProdutoServico extends Exercicio7Produto implements Exercicio7Promocao {

    public Exercicio7ProdutoServico(String nome, double preco, String categoria) {
        super(nome, preco, categoria);
    }

    /**
     * Implementa o método para calcular o preço final do serviço.
     *
     * @return preço final do serviço
     */
    @Override
    public double calcularPrecoFinal() {
        // Exemplo simples: preço final é o mesmo preço do serviço
        return preco;
    }

    /**
     * Implementa o método para exibir os detalhes do serviço.
     */
    @Override
    public void exibirDetalhes() {
        System.out.println("Produto Serviço:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Categoria: " + categoria);
    }

    /**
     * Implementa o método para aplicar promoção ao serviço.
     *
     * @return valor do desconto aplicado
     */
    @Override
    public double aplicarPromocao() {
        // Exemplo: aplica um desconto fixo de 15%
        return preco * 0.15;
    }
}
