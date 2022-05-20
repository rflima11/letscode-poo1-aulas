package aula4;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private Long id;
    public String nome;
    private List<Produto> produtoList = new ArrayList<>();
    private static long contadorId = 0;

    public Estoque(String nome) {
        inicializarId();
        this.nome = nome;
    }

    public void adicionarProduto(Produto novoProduto) {
        int quantidadeNovoProduto = novoProduto.getQuantidadeEstoque();
        for (Produto produto: produtoList) {
            if (novoProduto.getMarca().equals(produto.getMarca()) && novoProduto.getNome().equals(produto.getNome())) {
                produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() + quantidadeNovoProduto);
                return ;
            }
        }
        this.produtoList.add(novoProduto);
        System.out.println("Produto " + novoProduto.getId() + " adicionado com sucesso!");
    }

    public void listaProdutosImprime() {
        if (produtoList.isEmpty()) {
            System.out.println("Não há registro na lista");
        } else {
            for (Produto produto: produtoList) {
                System.out.println(produto);
            }
        }
    }


    public Long getId() {
        return id;
    }

    private void inicializarId() {
        contadorId++;
        this.id = contadorId;
    }




}
