package aula6.veiculos;

public class Carro extends Veiculo {

    public void correr() {
        this.posicao += 3;
        System.out.println("Carro está correndo");
    }
}
