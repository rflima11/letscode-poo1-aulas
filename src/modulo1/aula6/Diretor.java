package modulo1.aula6;

public class Diretor extends Funcionario {


    private int senha;

    @Override
    public double getBonificacao() {
        return this.salario + 200;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }

    @Override
    public void apresentarCargo() {
        System.out.println("Eu sou um diretor");
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
