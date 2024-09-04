package Exercicios;

/**
 * Classe Exercicio1FuncionarioMensalista representa um funcionário com salário fixo mensal.
 */
public class Exercicio1FuncionarioMensalista extends Exercicio1Funcionario implements Exercicio1Pagamento {

    public Exercicio1FuncionarioMensalista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário de um funcionário mensalista.
     * O salário é simplesmente o salário base.
     * @return o salário base.
     */
    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    /**
     * Processa o pagamento para o funcionário mensalista.
     * Exibe o valor do pagamento.
     */
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento processado para " + nome + ": R$" + calcularSalario());
    }
}
