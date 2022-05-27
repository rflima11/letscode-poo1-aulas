package modulo2.calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteMenu {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("========== CALCULADORA =============");
            System.out.println("Digite uma opção:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Divisao");
            System.out.println("5 - Sair");
            opcao = scan.nextInt();
            int a = 3;

            switch (opcao) {
                case 1:
                   Soma soma = new Soma();
                   double resultadoSoma = soma.calcular(TesteMenu.popularArray(scan));
                   System.out.println("Resultado soma é: " + resultadoSoma);
                   break;
                case 2:
                    Subtracao subtracao = new Subtracao();
                    double resultadoSubtracao = subtracao.calcular(popularArray(scan));
                    System.out.println("Resultado subtracao é: " + resultadoSubtracao);
                    break;
                case 3:
                    Multiplicacao multiplicacao = new Multiplicacao();
                    double resultadoMultiplicacao = multiplicacao.calcular(popularArray(scan));
                    System.out.println("Resultado multiplicacao: " + resultadoMultiplicacao);
                    break;
                case 4:
                    System.out.println("Resultado divisão: " + new Divisao().calcular(popularArray(scan)));
                    break;
                case 5:
                    System.out.println("Obrigado por usar minha calculadora");
                    break;
            }

        } while (opcao != 5);
        scan.close();
    }


    public static double[] popularArray(Scanner scan) {
        System.out.println("Quantos números você deseja utilizar?");
        int tamanhoArray = scan.nextInt();
        double[] arrayDouble = new double[tamanhoArray];
        for (int i = 0; i < tamanhoArray; i++) {
            arrayDouble[i] = scan.nextDouble();
        }
        return arrayDouble;
    }
}
