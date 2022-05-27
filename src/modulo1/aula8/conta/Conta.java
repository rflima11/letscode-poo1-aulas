package modulo1.aula8.conta;

public abstract class Conta {

    private int numero;
    protected double saldo;

    public abstract void sacar();

    public abstract void depositar();

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
