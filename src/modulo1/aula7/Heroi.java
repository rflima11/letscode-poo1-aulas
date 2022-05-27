package modulo1.aula7;

public class Heroi extends PersonagemBase {

    protected int dano;

    public Heroi() {
        this.vida = 100;
        this.dano = 20;
    }

    @Override
    public void atacar(PersonagemBase personagem, TipoAtaque tipoAtaque) {
        personagem.apanhar(dano, tipoAtaque);
    }

    @Override
    public void apanhar(int dano, TipoAtaque tipoAtaque) {
        if (!verificaSeEstaMorto()) {
            this.vida -= dano;
        }
        verificaSeEstaMorto();
    }

    @Override
    public void interagir() {
        System.out.println("Por que eu iria interagir com meu inimigo?");

    }
}
