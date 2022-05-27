package modulo1.aula1;

public class Calculadora {

    int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    int subtracao(int numero1, int numero2) {
        return numero1 - numero2;
    }

    void multiplicao(int numero1, int numero2) {
        int multiplicao = numero1 * numero2;
        System.out.println("A multiplicação de " + numero1 + " e " + numero2 + " é: " + multiplicao) ;
    }

    int divisao(int numero1, int numero2) {
        return numero1 / numero2;
    }
}
