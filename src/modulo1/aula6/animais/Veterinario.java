package modulo1.aula6.animais;

public class Veterinario {

    public void examinar(Animal animal) {
        animal.deveEmitirSom();

        if (animal instanceof Ornitorinco) {
            Ornitorinco animalQueNaVerdadeEhUmOrnitorinco = (Ornitorinco) animal;
            animalQueNaVerdadeEhUmOrnitorinco.botaOvo();
        }
    }

}
