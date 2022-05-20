package aula2;

import java.time.LocalDate;
import java.util.Random;

public class Jogador {

    int id;
    String nome;
    String apelido;
    LocalDate localDate;
    int numero;
    String posicao;
    int qualidade;
    int cartoesAmarelos;
    int cartaoVermelho;
    boolean suspenso;

    Jogador() {

    }

    public Jogador(int id, String nome, String apelido, LocalDate localDate, int numero, String posicao, int qualidade, int cartoesAmarelos, int cartaoVermelho, boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.localDate = localDate;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartaoVermelho = cartaoVermelho;
        this.suspenso = suspenso;
    }

    boolean verificarCondicaoDeJogo() {
        if (this.cartaoVermelho == 1 || this.cartoesAmarelos == 2) {
            this.suspenso = true;
        }
        return this.suspenso;
    }

    void aplicarCartaoAmarelo(int quantidade) {
        if (quantidade > 2) {
            System.out.println("Não é possível dar mais de dois cartões amarelos");
        } else {
            cartoesAmarelos += quantidade;
            verificarCondicaoDeJogo();
        }
    }

    void aplicarCartaoVermelho() {
        cartoesAmarelos += 1;
        verificarCondicaoDeJogo();
    }

    void cumprirSuspencao() {
        this.cartoesAmarelos = 0;
        this.cartaoVermelho = 0;
        suspenso = false;
    }

    void sofrerLesao() {

    }

    void executarLesao() {
        Random random = new Random();
        int randomNumber = random.ints(1, 3).findFirst().getAsInt();
        this.qualidade += randomNumber;
        if (qualidade < 0) {
            qualidade = 1;
        }
        System.out.println("Jogador " + this.nome + " sofreu uma lesão e perdeu " + randomNumber + " pontos de qualidade, qualidade atual: " + this.qualidade);
    }




}
