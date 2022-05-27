package modulo1.aula3;

import java.text.SimpleDateFormat;
import java.util.Date;

class Jogador {

    int id;
    String nome;
    String apelido;
    Date dataNascimento;
    int numero;
    String posicao;
    int qualidade;
    int cartoesAmarelos;
    int cartaoVermelho;
    boolean suspenso;

    Jogador() {
        //construtor vazio
    }

    public Jogador(int id, String nome, String apelido, Date dataNascimento, int numero, String posicao, int qualidade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
    }

    String retornarDataComoString() {
        SimpleDateFormat dateFor = new SimpleDateFormat("dd-MM-yyyy");
        String stringData = dateFor.format(dataNascimento);
        return stringData;
    }

    boolean verificarCondicaoDeJogo() {
        if (cartoesAmarelos == 3 || cartaoVermelho == 1) {
            suspenso = true;
        }
        return suspenso;
    }

    void aplicarCartaoAmarelo(int quantidade) {
       this.cartoesAmarelos += quantidade;
       verificarCondicaoDeJogo();
    }

    void aplicarCartaoVermelho() {
        this.cartaoVermelho = 1;
        verificarCondicaoDeJogo();
    }


    public String toString() {
        return this.posicao + ": " + this.numero + " - " +
                this.nome + "(" + this.apelido + ") - " + retornarDataComoString() +
                " CONDIÇÃO: " + (verificarCondicaoDeJogo() ? "NÃO PODE JOGAR" : "PODE JOGAR");
    }
}
