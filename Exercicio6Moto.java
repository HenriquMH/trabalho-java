package Exercicios;

/**
 * Classe Exercicio6Moto representa uma moto.
 * Implementa os métodos para ligar, desligar, acelerar e realizar manutenção específicos para motos.
 */
public class Exercicio6Moto extends Exercicio6Veiculo implements Exercicio6Manutencao {

    public Exercicio6Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    /**
     * Implementa o método para ligar a moto.
     */
    @Override
    public void ligar() {
        System.out.println("A moto " + marca + " " + modelo + " está ligada.");
    }

    /**
     * Implementa o método para desligar a moto.
     */
    @Override
    public void desligar() {
        System.out.println("A moto " + marca + " " + modelo + " está desligada.");
    }

    /**
     * Implementa o método para acelerar a moto.
     */
    @Override
    public void acelerar() {
        System.out.println("A moto " + marca + " " + modelo + " está acelerando.");
    }

    /**
     * Implementa o método para realizar manutenção na moto.
     */
    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção na moto " + marca + " " + modelo + ".");
    }
}
