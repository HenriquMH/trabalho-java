package Exercicios;

/**
 * Classe Exercicio1FuncionarioComissionado representa um funcionário pago por comissão.
 */
public class Exercicio1FuncionarioComissionado extends Exercicio1Funcionario implements Exercicio1Pagamento {
    private double vendasTotais;
    private double percentualComissao;

    public Exercicio1FuncionarioComissionado(String nome, double salarioBase, double vendasTotais, double percentualComissao) {
        super(nome, salarioBase);
        this.vendasTotais = vendasTotais;
        this.percentualComissao = percentualComissao;
    }

    /**
     * Calcula o salário de um funcionário comissionado.
     * O salário é o salário base mais uma comissão sobre as vendas.
     * @return o salário calculado.
     */
    @Override
    public double calcularSalario() {
        return salarioBase + (vendasTotais * percentualComissao);
    }

    /**
     * Processa o pagamento para o funcionário comissionado.
     * Exibe o valor do pagamento.
     */
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento processado para " + nome + ": R$" + calcularSalario());
    }
}
