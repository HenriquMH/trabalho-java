package Exercicios;

public class Exercicio1FuncionarioMensalista extends Exercicio1Funcionario implements Exercicio1Pagamento {

    public Exercicio1FuncionarioMensalista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento processado para " + nome + ": R$" + calcularSalario());
    }
}