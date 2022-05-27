package modulo1.aula4;

public class Produto {

    private Long id;
    private String nome;
    private String sessao;
    private int quantidadeEstoque;
    private String marca;
    private String tipo;
    private static long contadorId;

    public Produto(String nome, String sessao, int quantidadeEstoque, String marca) {
        inicializarId();
        this.nome = nome;
        this.sessao = sessao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.marca = marca;
    }

    private void inicializarId() {
        contadorId++;
        id = contadorId;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getSessao() {
        return sessao;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sessao='" + sessao + '\'' +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
