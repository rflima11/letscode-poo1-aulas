package aula5;

public class IdentificadorFuncionario {

    public static void identificarFuncionario(Funcionario funcionario) {
        if (funcionario instanceof Funcionario) {
            System.out.println("É um Funcionario");
        } else if (funcionario instanceof Professor) {
            System.out.println("É um professor");
            Professor professor = (Professor) funcionario;
            professor.darAula();
        } else if (funcionario instanceof Diretor) {
            System.out.println("É um diretor");
        }
    }

}
