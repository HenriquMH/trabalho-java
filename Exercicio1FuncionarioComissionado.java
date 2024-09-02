package Exercicios;

public class Exercicio1FuncionarioComissionado extends Exercicio1Funcionario implements Exercicio1Pagamento {
    private double vendasTotais;
    private double percentualComissao;

    public Exercicio1FuncionarioComissionado(String nome, double salarioBase, double vendasTotais, double percentualComissao) {
        super(nome, salarioBase);
        this.vendasTotais = vendasTotais;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (vendasTotais * percentualComissao);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento processado para " + nome + ": R$" + calcularSalario());
    }
}