package modulo1.aula8.conta;

public class ContaSalario extends Conta {

    @Override
    public void sacar() {
        System.out.println("saque modulo1.aula8.conta salário");
    }

    @Override
    public void depositar() {
        System.out.println("deposito modulo1.aula8.conta salário");
    }
}
