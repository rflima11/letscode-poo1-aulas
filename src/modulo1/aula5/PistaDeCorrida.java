package modulo1.aula5;

import java.util.ArrayList;
import java.util.List;

public class PistaDeCorrida {


    List<Veiculo> veiculos;

    public PistaDeCorrida() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculoACorrida(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void iniciarCorrida() {
        for(Veiculo veiculo : veiculos) {
            veiculo.andar();
        }
    }
}
