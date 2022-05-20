package aula1;

class Aluno {

    String nome;
    int[] notas;
    boolean estaAprovado;

    Aluno(String nome, int nota1, int nota2, int nota3) {
        this.nome = nome;
        this.notas = new int[3];
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
        this.estaAprovado = calcularMedia(this.notas[0], this.notas[1], this.notas[2]);
    }

    void apresentar() {
        System.out.println("Olá meu nome é " + nome);
    }

    boolean calcularMedia(int nota1, int nota2, int nota3) {
        if (((nota1 + nota2 + nota3) / 3) >= 6) {
            return true;
        } else {
            return false;
        }

    }


}
