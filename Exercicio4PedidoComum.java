package Exercicios;

/**
 * Classe Exercicio4PedidoComum representa um pedido comum no restaurante.
 * Implementa os métodos para calcular o total, adicionar e remover itens.
 */
public class Exercicio4PedidoComum extends Exercicio4Pedido {

    public Exercicio4PedidoComum(int numeroPedido) {
        super(numeroPedido);
    }

    /**
     * Implementa o método para calcular o total do pedido comum.
     *
     * @return total do pedido
     */
    @Override
    public double calcularTotal() {
        return itens.size() * 10.0; // Exemplo simples: cada item custa 10.0
    }

    /**
     * Implementa o método para adicionar um item ao pedido comum.
     *
     * @param item item a ser adicionado
     */
    @Override
    public void adicionarItem(String item) {
        itens.add(item);
    }

    /**
     * Implementa o método para remover um item do pedido comum.
     *
     * @param item item a ser removido
     */
    @Override
    public void removerItem(String item) {
        itens.remove(item);
    }
}
