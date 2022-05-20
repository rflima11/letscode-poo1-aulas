package aula6;

import aula7.Gigante;
import aula7.Heroi;

import java.util.Objects;

public class TesteFuncionario {


    public static void main(String[] args) {

        Diretor diretor = new Diretor();
        diretor.setSalario(3000);
        diretor.setSenha(2222);

        SistemaClass sistemaClass = new SistemaClass();
        sistemaClass.autentica(diretor);


        Heroi heroi = new Heroi();



//        Funcionario funcionarioProfessor = new Professor();
//        funcionarioProfessor.apresentarCargo();
//        funcionarioProfessor.setSalario(2000);
//
//        Professor professor = new Professor();
//        professor.setSalario(2500);
//
//        GerenciadorBonificacao gerenciadorBonificacao = new GerenciadorBonificacao();
//
//        gerenciadorBonificacao.registraBonificacao(diretor);
//        gerenciadorBonificacao.registraBonificacao(funcionarioProfessor);
//        gerenciadorBonificacao.registraBonificacao(professor);
//
//        System.out.println("A soma é: " + gerenciadorBonificacao.getSomaBonificacao());
//        System.out.println(funcionario);

    }
}
