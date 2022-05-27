package modulo2.calculadora;

public class Main {

    public static void main(String[] args) {
        Soma soma = new Soma();
        System.out.println("Soma : " + soma.calcular(1, 3));

        Multiplicacao multiplicacao = new Multiplicacao();
        double resultadoMulti = multiplicacao.calcular(3, 6);

        Subtracao subtracao = new Subtracao();
        double resultadoSubtracao = subtracao.calcular(10);
        System.out.println("Subtracao: " + resultadoSubtracao);
        System.out.println("Calculo " + resultadoMulti);

        Divisao divisao = new Divisao();
        double resultadoDivisao = divisao.calcular(10, 0);
        System.out.println("Resultado divisao: " + resultadoDivisao);
    }
}
