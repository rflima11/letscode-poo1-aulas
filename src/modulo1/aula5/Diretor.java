package modulo1.aula5;

public class Diretor extends Funcionario {


    public double calculaBonificacao() {
        System.out.println("Estou chamando o calculo bonificao da classe Diretor");
        return this.salario + 200;
    }
}
