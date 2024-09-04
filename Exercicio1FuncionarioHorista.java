package Exercicios;

/**
 * Classe Exercicio1FuncionarioHorista representa um funcionário pago por hora.
 */
public class Exercicio1FuncionarioHorista extends Exercicio1Funcionario implements Exercicio1Pagamento {
    private double horasTrabalhadas;
    private double valorHora;

    public Exercicio1FuncionarioHorista(String nome, double salarioBase, double horasTrabalhadas, double valorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    /**
     * Calcula o salário de um funcionário horista.
     * O salário é calculado multiplicando as horas trabalhadas pelo valor por hora.
     * @return o salário calculado.
     */
    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    /**
     * Processa o pagamento para o funcionário horista.
     * Exibe o valor do pagamento.
     */
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento processado para " + nome + ": R$" + calcularSalario());
    }
}
