package modulo1.aula4;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario() {

    }

    public Funcionario(String nome, String cpf, int idade, double salario) {
        super(nome, cpf, idade);
        this.salario = salario;
    }

    //SOBRECARGA
    public String apresenta(String nome) {
        return "Olá eu sou um funcionário " + nome;
    }

    public String toString() {
        String toStringObject = super.toString();
        return "Olá eu sou um funcionário meu nome " + nome + " toString padrão: " + toStringObject;
    }







}
