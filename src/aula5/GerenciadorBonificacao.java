package aula5;

public class GerenciadorBonificacao {

    private double somaBonificacoes;

    public void registra(Funcionario funcionario) {
        somaBonificacoes += funcionario.calculaBonificacao();
    }

    public double getSomaBonificacoes() {
        return somaBonificacoes;
    }
}
