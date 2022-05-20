package aula6.veiculos;

public class Bicicleta extends Veiculo {

    @Override
    public void correr() {
        this.posicao += 1;
        System.out.println("Correndo com a bicicleta");
    }
}
