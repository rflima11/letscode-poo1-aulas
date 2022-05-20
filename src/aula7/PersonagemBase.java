package aula7;

public abstract class PersonagemBase {

    protected String nome;
    private boolean isDead;
    protected int vida;

    public abstract void atacar(PersonagemBase personagem, TipoAtaque tipoAtaque);

    public abstract void apanhar(int dano, TipoAtaque tipoAtaque);

    public abstract void interagir();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean verificaSeEstaMorto() {
        if (vida > 0) {
            this.isDead = false;
            return false;
        }
        this.isDead = true;
        System.out.println("O personagem " + this.nome + " morreu :(");
        return true;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
