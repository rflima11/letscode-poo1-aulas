package modulo2.funcionarios;

public class TesteFuncionario {

    public static void main(String[] args) {

        GerenciadorFuncionarios gerenciadorFuncionarios = new GerenciadorFuncionarios();

        gerenciadorFuncionarios.admitirNovosFuncionarios(new RodolfoDB());

        gerenciadorFuncionarios.admitirNovosFuncionarios(new LeitorArquivoTexto());

    }
}
