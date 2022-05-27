package modulo1.aula5;

import java.util.ArrayList;
import java.util.List;

public class TesteHeranca {


    public static void main(String[] args) {

        Funcionario funcionarioQualquer = new Funcionario();
        funcionarioQualquer.setNome("Roberto");
        funcionarioQualquer.setSalario(3000);

        List<String> lista1 = new ArrayList<>();

        ArrayList<String> lista = new ArrayList<>();

        Professor professor1 = new Professor();
//        professor1.setNome("Alberto");
//        professor1.setSalario(2000);

        Diretor diretor = new Diretor();

        System.out.println(diretor instanceof Diretor);


//        diretor.setNome("José");
//        diretor.setSalario(5000);

        GerenciadorBonificacao gerenciadorBonificacao = new GerenciadorBonificacao();

        gerenciadorBonificacao.registra(funcionarioQualquer);
        gerenciadorBonificacao.registra(professor1);
        gerenciadorBonificacao.registra(diretor);

//        System.out.println("A soma das bonificações é: " + gerenciadorBonificacao.getSomaBonificacoes());

    }
}
