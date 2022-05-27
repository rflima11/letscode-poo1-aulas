package modulo1.aula8.deposito;

import java.util.ArrayList;
import java.util.List;

public class EstoqueCelular implements Estoque {

    private List<Produto> celulares;

    public EstoqueCelular() {
        celulares = new ArrayList<>();
    }

    @Override
    public void adicionarItemAoEstoque(Produto produto) {
        celulares.add(produto);
    }

    @Override
    public void listarProdutos() {
        for (Produto celular : celulares) {
            System.out.println(celular);
        }
    }
}
