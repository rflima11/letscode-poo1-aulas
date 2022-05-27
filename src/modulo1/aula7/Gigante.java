package modulo1.aula7;

public class Gigante extends PersonagemBase {

    public Gigante(String nome) {
        this.nome = nome;
        this.vida = 70;
    }

    public void atacar(PersonagemBase personagem, TipoAtaque tipoAtaque) {
        personagem.apanhar(25, TipoAtaque.PANCADA);
        System.out.println("Causou 25 de dano e agora o " + personagem.getNome() + " está atordado");

        if (personagem.verificaSeEstaMorto()) {
            interagir();
        }
    }

    public void apanhar(int dano, TipoAtaque tipoAtaque) {
        if (!verificaSeEstaMorto()) {
            if (TipoAtaque.PERFURANTE == tipoAtaque) {
                vida -= dano * 2;
                System.out.println("owntch fui perfurado");
            }
        }

        verificaSeEstaMorto();

    }

    @Override
    public void interagir() {
        System.out.println("HA HA HA HA");
    }


}
