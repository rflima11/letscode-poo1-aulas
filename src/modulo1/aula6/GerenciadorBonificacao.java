package modulo1.aula6;

public class GerenciadorBonificacao {

    private double somaBonificacao;


    public double registraBonificacao(Funcionario funcionario) {
        return somaBonificacao += funcionario.getBonificacao();
    }

    public double getSomaBonificacao() {
        return somaBonificacao;
    }
}
