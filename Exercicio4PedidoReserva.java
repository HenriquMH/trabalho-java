package Exercicios;

/**
 * Classe Exercicio4PedidoReserva representa um pedido de reserva no restaurante.
 * Implementa os métodos para calcular o total, adicionar e remover itens.
 */
public class Exercicio4PedidoReserva extends Exercicio4Pedido {

    public Exercicio4PedidoReserva(int numeroPedido) {
        super(numeroPedido);
    }

    /**
     * Implementa o método para calcular o total do pedido de reserva.
     *
     * @return total do pedido
     */
    @Override
    public double calcularTotal() {
        return itens.size() * 15.0; // Exemplo: cada item custa 15.0 para reservas
    }

    /**
     * Implementa o método para adicionar um item ao pedido de reserva.
     *
     * @param item item a ser adicionado
     */
    @Override
    public void adicionarItem(String item) {
        itens.add(item);
    }

    /**
     * Implementa o método para remover um item do pedido de reserva.
     *
     * @param item item a ser removido
     */
    @Override
    public void removerItem(String item) {
        itens.remove(item);
    }
}
