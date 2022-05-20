package aula6.veiculos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteVeiculos {

    public static void main(String[] args) {
            Carro carro = new Carro();
            Moto moto = new Moto();
            Bicicleta bicicleta = new Bicicleta();

            List<Veiculo> veiculos = new ArrayList<>(); //declarei uma lista de veiculos
            veiculos.add(carro);
            veiculos.add(moto);
            veiculos.add(bicicleta);

            //iniciar uma corrida
            PistaDeCorrida.iniciarCorrida(veiculos);
    }
}
