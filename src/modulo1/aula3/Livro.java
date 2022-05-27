package modulo1.aula3;

public class Livro {

    private int id;
    private String nome;
    private String autor;
    private EnumGenero genero;
    private boolean estaAlugado;
    private Aluno portador;

    public Livro(int id, String nome, String autor, EnumGenero genero, boolean estaAlugado, Aluno portador) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.estaAlugado = estaAlugado;
        this.portador = portador;
    }
}
