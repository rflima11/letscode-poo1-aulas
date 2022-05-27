package modulo1.aula1;

class TesteCalculadora {


    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int soma = calculadora.somar(5, 5);
        System.out.println("A soma de 5 + 5 é: " + soma);

        int subtracao = calculadora.subtracao(5, 5);
        System.out.println("O valor da subtração de 5 - 5 é " + subtracao );

        calculadora.multiplicao(5, 5);

        int divisao = calculadora.divisao(5, 5);
        System.out.println("O resultado da divisao de 5, 5 é: " + divisao);

    }
}
