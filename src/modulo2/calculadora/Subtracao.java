package modulo2.calculadora;

public class Subtracao implements Calculo {

    @Override
    public double calcular(double... numeros) {
        double resultado = numeros[0];

        if (numeros.length == 1) {
            resultado = numeros[0];
        } else {
            for (int i = 1; i < numeros.length; i++) {
                resultado -= numeros[i];
            }
        }
        return resultado;
    }
}
