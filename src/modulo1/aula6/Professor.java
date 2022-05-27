package modulo1.aula6;

public class Professor extends Funcionario {

    @Override
    public double getBonificacao() {
        return this.salario + 100;
    }

    @Override
    public void apresentarCargo() {
        System.out.println("Eu sou um professor ");
    }

    public void darAula() {
        System.out.println("Estou dando aula");
    }
}
