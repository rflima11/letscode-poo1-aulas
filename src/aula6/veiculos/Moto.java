package aula6.veiculos;

public class Moto extends Veiculo {

    public void correr() {
        this.posicao += 7;
        System.out.println("Moto está correndo ");
    }
}
