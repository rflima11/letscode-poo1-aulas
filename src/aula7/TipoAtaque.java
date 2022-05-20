package aula7;

public enum TipoAtaque {

    PERFURANTE("É um ataque perfurante"),
    FOGO("É um ataque fogo!"),
    PANCADA("É um ataque pancada");

    private String descricao;

    TipoAtaque(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricaoAtaque() {
        return this.descricao;
    }
}
