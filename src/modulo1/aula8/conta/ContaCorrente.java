package modulo1.aula8.conta;

public class ContaCorrente extends Conta implements Tributavel {

    public void sacar() {
        System.out.println("saque modulo1.aula8.conta corrente");
    }

    public void depositar() {
        System.out.println("saque modulo1.aula8.conta corrente");
    }


    @Override
    public double calcularTributo(Double taxa) {
        return this.saldo * taxa;
    }
}
