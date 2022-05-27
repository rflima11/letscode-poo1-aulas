package modulo1.aula3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ContaCorrente {

    private int numero;
    private double saldo;
    private List<String> numerosCartoes;

    public ContaCorrente() {
        //construtor vazio
        numerosCartoes = new ArrayList<>();
    }

    public ContaCorrente(int numero, double saldo, List<String> numerosCartoes) {
        this.numero = numero;
        this.saldo = saldo;
        this.numerosCartoes = numerosCartoes;
    }

    public void setNumerosCartoes(List<String> numerosCartoes) {
        this.numerosCartoes = numerosCartoes;
    }

    public Collection<String> getNumerosCartoes() {
        return Collections.unmodifiableCollection(numerosCartoes);
    }



    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }



    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public ContaCorrente setSaldo(double saldo) {
        this.saldo = saldo;
        return this;
    }

    void sacar(double quantidade) {
        if (this.saldo + 1 > quantidade) {
            this.saldo -= quantidade + 1;
        }
     }
}
