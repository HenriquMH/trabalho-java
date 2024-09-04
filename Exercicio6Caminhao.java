package Exercicios;

/**
 * Classe Exercicio6Caminhao representa um caminhão.
 * Implementa os métodos para ligar, desligar, acelerar e realizar manutenção específicos para caminhões.
 */
public class Exercicio6Caminhao extends Exercicio6Veiculo implements Exercicio6Manutencao {

    public Exercicio6Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    /**
     * Implementa o método para ligar o caminhão.
     */
    @Override
    public void ligar() {
        System.out.println("O caminhão " + marca + " " + modelo + " está ligado.");
    }

    /**
     * Implementa o método para desligar o caminhão.
     */
    @Override
    public void desligar() {
        System.out.println("O caminhão " + marca + " " + modelo + " está desligado.");
    }

    /**
     * Implementa o método para acelerar o caminhão.
     */
    @Override
    public void acelerar() {
        System.out.println("O caminhão " + marca + " " + modelo + " está acelerando.");
    }

    /**
     * Implementa o método para realizar manutenção no caminhão.
     */
    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção no caminhão " + marca + " " + modelo + ".");
    }
}
