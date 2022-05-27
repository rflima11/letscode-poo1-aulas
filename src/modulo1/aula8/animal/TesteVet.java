package modulo1.aula8.animal;

public class TesteVet {

    public static void main(String[] args) {
        Cachorro doguinho = new Cachorro();
        Papagaio louro = new Papagaio();
        Morcego zubat = new Morcego();
        Cavalo ventania = new Cavalo();

        Veterinario veterinario = new Veterinario();

        veterinario.examinar(doguinho);
        veterinario.examinar(louro);
        veterinario.examinar(zubat);
        veterinario.examinar(ventania);

//        veterinario.examinarVoadores(louro);
      veterinario.examinarVoadores(zubat);


    }
}
