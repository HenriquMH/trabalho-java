package Exercicios;

/**
 * Classe Exercicio6Carro representa um carro.
 * Implementa os métodos para ligar, desligar, acelerar e realizar manutenção específicos para carros.
 */
public class Exercicio6Carro extends Exercicio6Veiculo implements Exercicio6Manutencao {

    public Exercicio6Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    /**
     * Implementa o método para ligar o carro.
     */
    @Override
    public void ligar() {
        System.out.println("O carro " + marca + " " + modelo + " está ligado.");
    }

    /**
     * Implementa o método para desligar o carro.
     */
    @Override
    public void desligar() {
        System.out.println("O carro " + marca + " " + modelo + " está desligado.");
    }

    /**
     * Implementa o método para acelerar o carro.
     */
    @Override
    public void acelerar() {
        System.out.println("O carro " + marca + " " + modelo + " está acelerando.");
    }

    /**
     * Implementa o método para realizar manutenção no carro.
     */
    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção no carro " + marca + " " + modelo + ".");
    }
}
