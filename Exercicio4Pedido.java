package Exercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe abstrata Exercicio4Pedido representa um pedido genérico no restaurante.
 * Contém atributos e métodos comuns a todos os tipos de pedidos.
 */
public abstract class Exercicio4Pedido {
    protected int numeroPedido;
    protected List<String> itens;
    protected String status;

    public Exercicio4Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.itens = new ArrayList<>();
        this.status = "Pendente";
    }

    /**
     * Método abstrato para calcular o total do pedido.
     * Deve ser implementado pelas subclasses para calcular o total de acordo com o tipo de pedido.
     */
    public abstract double calcularTotal();

    /**
     * Método abstrato para adicionar um item ao pedido.
     * Deve ser implementado pelas subclasses para adicionar itens ao pedido.
     */
    public abstract void adicionarItem(String item);

    /**
     * Método abstrato para remover um item do pedido.
     * Deve ser implementado pelas subclasses para remover itens do pedido.
     */
    public abstract void removerItem(String item);

    /**
     * Retorna o status do pedido.
     *
     * @return status do pedido
     */
    public String getStatus() {
        return status;
    }

    /**
     * Altera o status do pedido.
     *
     * @param status novo status do pedido
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
