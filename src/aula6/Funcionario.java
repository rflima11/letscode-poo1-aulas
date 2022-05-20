package aula6;

public abstract class Funcionario {

    private String nome;
    protected double salario;

    public abstract double getBonificacao();

    public abstract void apresentarCargo();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
