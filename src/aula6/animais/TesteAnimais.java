package aula6.animais;

public class TesteAnimais {


    public static void main(String[] args) {

        Cavalo cavalo = new Cavalo();
        Ornitorinco ornitorinco = new Ornitorinco();
        Cachorro cachorro = new Cachorro();

        Veterinario veterinario = new Veterinario();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(ornitorinco);
    }
}
