package Exercicios;

public class Exercicio1FuncionarioHorista extends Exercicio1Funcionario implements Exercicio1Pagamento {
    private double horasTrabalhadas;
    private double valorHora;

    public Exercicio1FuncionarioHorista(String nome, double salarioBase, double horasTrabalhadas, double valorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento processado para " + nome + ": R$" + calcularSalario());
    }
}