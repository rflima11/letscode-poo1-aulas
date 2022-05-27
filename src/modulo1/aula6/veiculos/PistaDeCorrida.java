package modulo1.aula6.veiculos;

import java.util.List;

public class PistaDeCorrida {

    public static void iniciarCorrida(List<Veiculo> veiculos) {
        for (Veiculo veiculo : veiculos) {
            veiculo.correr();
        }
    }


}
