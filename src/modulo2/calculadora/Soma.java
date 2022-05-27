package modulo2.calculadora;

public class Soma implements Calculo {

    @Override
    public double calcular(double... numeros) {
        double resultado = 0;
        for (double numero: numeros) {
            resultado += numero;
        }
        return resultado;
    }
}
