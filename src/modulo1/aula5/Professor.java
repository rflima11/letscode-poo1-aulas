package modulo1.aula5;

public class Professor extends Funcionario {

    private String especializacao;

    public void imprime() {
        System.out.println("Nome: " + nome);
    }

    public String getEspecializacao(){
        return especializacao;
    }

    public void darAula() {
        System.out.println("O professor está dando aula zzzzzz");
    }

    public double calculaBonificacao() {
        System.out.println("Estou chamando o calculo bonificao da classe Professor");
        return this.salario + 50;
    }

}
