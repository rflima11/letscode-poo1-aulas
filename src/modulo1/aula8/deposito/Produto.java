package modulo1.aula8.deposito;

public abstract class Produto {

    private String descricao;
    private double preco;

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return descricao + " preço: " + preco;
    }
}
