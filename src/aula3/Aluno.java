package aula3;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private int idade;
    private long idMatricula;
    private String telefone;
    private List<Livro> livros = new ArrayList<>();
    public static final int QUANTIDADE_MAXIMA_LIVROS = 5;


    public Aluno() {

    }

    public Aluno(String nome, int idade, long idMatricula, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.idMatricula = idMatricula;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(long idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public boolean verificaSeAlunoPodeAlugar() {
        if (getLivros().size() >= Aluno.QUANTIDADE_MAXIMA_LIVROS) {
            System.out.println("Não é possível alugar mais de " + Aluno.QUANTIDADE_MAXIMA_LIVROS + " livros");
        }
        return !(getLivros().size() >= Aluno.QUANTIDADE_MAXIMA_LIVROS);
    }

    public void adicionaNovoLivro(Livro livro) {
        livros.add(livro);
    }


}
