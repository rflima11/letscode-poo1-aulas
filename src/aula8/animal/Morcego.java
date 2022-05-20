package aula8.animal;

public class Morcego extends Animal implements Voadores {

    @Override
    public void deveEmitirSom() {
        System.out.println("QUIQUI");
    }

    @Override
    public void voar() {
        System.out.println("Morcego está voando");
    }

}
