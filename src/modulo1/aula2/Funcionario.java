package modulo1.aula2;

class Funcionario {

    String nome;
    String sobrenome;
    Integer horasTrabalhadas;
    Double valorPorHora;
    Boolean ativo;

    Funcionario()  {
        //construtor vazio
    }

    Funcionario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    void nomeCompleto() {
        System.out.println(this.nome + " " + this.sobrenome);
    }

    void calcularSalario() {
      double valorTotal = horasTrabalhadas * valorPorHora;
      System.out.println("O valor total recebido do mês é: " + valorTotal);
    }

    void incrementaHoras(Integer horas) {

        horasTrabalhadas += horas;
    }

    void demitir() {
        this.ativo = false;
    }

}
