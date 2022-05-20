package aula2;

import java.time.LocalDate;

class Pessoa {

    String nome;
    int idade;
    double alturaCentimetros;
    double pesoEmQuilogramas;
    char sexo;
    LocalDate dataCadastro;
    Boolean estaAtivo;

    Pessoa() {
       nome = "Rodolfo";
       idade = 25;
       dataCadastro = LocalDate.now();
       estaAtivo = true;
    }

    Pessoa(String nome, int idade, double alturaCentimetros, double pesoEmQuilogramas, char sexo, LocalDate dataCadastro, Boolean estaAtivo) {
        this.nome = nome;
        this.idade = idade;
        this.alturaCentimetros = alturaCentimetros;
        this.pesoEmQuilogramas = pesoEmQuilogramas;
        this.sexo = sexo;
        this.dataCadastro = dataCadastro;
        this.estaAtivo = estaAtivo;
    }

    void falar() {
        System.out.println(this.nome + " está falando");
    }

    int getIdade() {
        return this.idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", alturaCentimetros=" + alturaCentimetros +
                ", pesoEmQuilogramas=" + pesoEmQuilogramas +
                ", sexo=" + sexo +
                ", dataCadastro=" + dataCadastro +
                ", estaAtivo=" + estaAtivo +
                '}';
    }


}
