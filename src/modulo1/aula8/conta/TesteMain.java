package modulo1.aula8.conta;

public class TesteMain {

    public static void main(String[] args) {

        ContaCorrente contaCorrente  = new ContaCorrente();
        Conta contaSalario = new ContaSalario();

        contaCorrente.setSaldo(10000);

        double retorno = GerenciadorTributos.calcularTributoConta(contaCorrente, 0.1);

        System.out.println("O retorno é: " + retorno);
    }
}
