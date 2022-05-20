package aula8.conta;

public class ContaSalario extends Conta {

    @Override
    public void sacar() {
        System.out.println("saque aula8.conta salário");
    }

    @Override
    public void depositar() {
        System.out.println("deposito aula8.conta salário");
    }
}
