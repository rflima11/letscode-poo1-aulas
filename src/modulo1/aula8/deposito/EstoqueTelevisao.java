package modulo1.aula8.deposito;

import java.util.List;

public class EstoqueTelevisao {

    List<Televisao> televisoes;

    public void adicionarItemAoEstoque(Televisao televisao) {
        televisoes.add(televisao);
    }

    public void listarProdutos() {
        for (Televisao televisao : televisoes) {
            System.out.println(televisao);
        }
    }
}
