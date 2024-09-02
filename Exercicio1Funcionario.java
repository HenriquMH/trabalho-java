
package Exercicios;

public abstract class  Exercicio1Funcionario {

        protected String nome;
        protected double salarioBase;
        
        public Exercicio1Funcionario(String nome, double salarioBase){
            this.nome = nome;
            this.salarioBase = salarioBase;
        }
        
        public abstract double calcularSalario ();
}
