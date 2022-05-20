package aula5;

public class Funcionario {

    protected String nome;
    protected String cpf;
    protected double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculaBonificacao(){
        System.out.println("Estou chamando o calculo bonificao da classe Funcionário");
        return this.salario + 10;
    }
}
