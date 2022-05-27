package modulo1.aula5;

public class TesteVeiculo {


    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();

        PistaDeCorrida pistaDeCorrida = new PistaDeCorrida();
        pistaDeCorrida.adicionarVeiculoACorrida(carro);
        pistaDeCorrida.adicionarVeiculoACorrida(moto);

        pistaDeCorrida.iniciarCorrida();
    }
}
