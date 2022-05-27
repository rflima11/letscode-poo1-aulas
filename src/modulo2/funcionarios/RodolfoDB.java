package modulo2.funcionarios;

import java.util.ArrayList;
import java.util.List;

public class RodolfoDB implements IntegradorNovosFuncionarios {

    @Override
    public List<Funcionario> recuperarDadosNovosFuncionarios() {
        return buscaFuncionariosDoBanco();
    }

    private List<Funcionario> buscaFuncionariosDoBanco() {
        List<Funcionario> funcionariosBanco = new ArrayList<>();
        funcionariosBanco.add(new Funcionario("Gilberto", "3218181"));
        funcionariosBanco.add(new Funcionario("Adamastor", "34262365"));
        return funcionariosBanco;
    }
}
