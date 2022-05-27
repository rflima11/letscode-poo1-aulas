package modulo2.funcionarios;

import java.util.List;

public class GerenciadorFuncionarios {

    public void admitirNovosFuncionarios(IntegradorNovosFuncionarios integrador) {
        List<Funcionario> novosFuncionarios = integrador.recuperarDadosNovosFuncionarios();
        for (Funcionario funcionario: novosFuncionarios) {
            System.out.println("Bem vindo a empresa: " + funcionario.getNome());
        }

    }
}
