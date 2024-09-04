package Exercicios;

/**
 * Classe Exercicio4PedidoDelivery representa um pedido de delivery no restaurante.
 * Implementa os métodos para calcular o total, adicionar e remover itens, e aplicar desconto.
 */
public class Exercicio4PedidoDelivery extends Exercicio4Pedido implements Exercicio4Desconto {

    private double taxaEntrega;

    public Exercicio4PedidoDelivery(int numeroPedido, double taxaEntrega) {
        super(numeroPedido);
        this.taxaEntrega = taxaEntrega;
    }

    /**
     * Implementa o método para calcular o total do pedido de delivery.
     *
     * @return total do pedido
     */
    @Override
    public double calcularTotal() {
        return itens.size() * 10.0 + taxaEntrega; // Cada item custa 10.0 + taxa de entrega
    }

    /**
     * Implementa o método para adicionar um item ao pedido de delivery.
     *
     * @param item item a ser adicionado
     */
    @Override
    public void adicionarItem(String item) {
        itens.add(item);
    }

    /**
     * Implementa o método para remover um item do pedido de delivery.
     *
     * @param item item a ser removido
     */
    @Override
    public void removerItem(String item) {
        itens.remove(item);
    }

    /**
     * Implementa o método para aplicar desconto no pedido de delivery.
     *
     * @return valor do desconto aplicado
     */
    @Override
    public double aplicarDesconto(double total) {
        return total * 0.9; // Aplica 10% de desconto
    }
}
