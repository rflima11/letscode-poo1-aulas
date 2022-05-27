package modulo1.aula6;

import modulo1.aula7.Heroi;

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
