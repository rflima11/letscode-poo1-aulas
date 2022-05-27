package modulo1.aula1;

import java.util.Scanner;

public class Aula1 {

//2 - Escreva um programa que lê nome e idade de 5 pessoas
//    e ao final informa quem é o mais novo, o mais velho

    void achaPessoaMaisNovaEMaisVelha(Pessoa[] pessoas) {
        Pessoa pessoaMaisVelha = pessoas[0];
        for(int i = 1; i < pessoas.length; i++) {
            if (pessoaMaisVelha.idade < pessoas[i].idade) {
                pessoaMaisVelha = pessoas[i];
            } else if (pessoaMaisVelha.idade > pessoas[i].idade) {
                System.out.println("A idade da pessoa mais nova é: " + pessoas[i].idade);
            }
            System.out.println("A idade da pessoa mais velha é: " + pessoaMaisVelha.idade);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aula1 aula1 = new Aula1();

        Pessoa[] pessoas = new Pessoa[2];

        for(int i = 0; i < pessoas.length; i++) {
            System.out.println("Informe um nome: ");
            String nome = scan.next();
            System.out.println("Informe a idade: ");
            int idade = scan.nextInt();
            Pessoa pessoa = new Pessoa(nome, idade);
            pessoas[i] = pessoa;
        }

        aula1.achaPessoaMaisNovaEMaisVelha(pessoas);

        scan.close();
    }
}
