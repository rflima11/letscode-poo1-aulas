package aula2;

public class ExemploExercicio {

    public static void main(String[] args) {

//        Funcionario funcionarioQualquer = new Funcionario();
//        funcionarioQualquer.horasTrabalhadas = 32;
//        funcionarioQualquer.valorPorHora = 90d;
//        funcionarioQualquer.incrementaHoras(10);
//        funcionarioQualquer.calcularSalario();
//      funcionarioQualquer.nomeCompleto();


        Funcionario novoFuncionario = new Funcionario("Luis", "Silva");
        novoFuncionario.horasTrabalhadas = 10;
        novoFuncionario.valorPorHora = 25.50;
        novoFuncionario.nomeCompleto();
        novoFuncionario.calcularSalario();
        novoFuncionario.incrementaHoras(8);
        novoFuncionario.calcularSalario();
    }
}
