package modulo1.aula7;

public class TesteMain {

    public static void main(String[] args) {

        Gigante primeiroGigante = new Gigante("Adamastor");

        Heroi heroi = new Heroi();
        heroi.setNome("Gerson");

        heroi.dano = 100;

        primeiroGigante.atacar(heroi, TipoAtaque.PANCADA);
        primeiroGigante.atacar(heroi, TipoAtaque.PANCADA);
        primeiroGigante.atacar(heroi, TipoAtaque.PANCADA);

//        heroi.atacar(primeiroGigante, TipoAtaque.PERFURANTE);
//        heroi.atacar(primeiroGigante, TipoAtaque.PERFURANTE);


//        System.out.println("A vida do gigante está em: " + primeiroGigante.getVida());

    }
}
