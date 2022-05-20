package aula3;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nome;
    private List<Livro> livros = new ArrayList<>();
    public static int contador = 0;

    public Biblioteca() {
        contador++;
    }

    public String getNome() {
        return this.nome;
    }

    public void alugar(Livro livro, Aluno aluno) {
        aluno.verificaSeAlunoPodeAlugar();
        aluno.adicionaNovoLivro(livro);
    }









}
