package modulo1.aula5;

public class TesteIdentificador {


    public static void main(String[] args) {
        Funcionario diretor = new Professor();
        diretor.setNome("Rodolfo");

        IdentificadorFuncionario.identificarFuncionario(diretor);
    }
}
