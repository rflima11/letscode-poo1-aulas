package modulo1.aula4;

public class TesteAula {


    public static void main(String[] args) {
        Estoque estoque = new Estoque("Estoque da LetsCode");

        Produto celular = new Produto("Celular", "Eletronico", 2, "Samsung");

        Produto iphone = new Produto("Celular Iphone", "Eletronico", 1, "Apple");

        estoque.adicionarProduto(celular);

        estoque.adicionarProduto(iphone);

        estoque.listaProdutosImprime();

        System.out.println("Estoque tem o ID: " + estoque.getId());
    }
}
