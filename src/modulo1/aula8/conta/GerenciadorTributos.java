package modulo1.aula8.conta;

public class GerenciadorTributos {

    public static double calcularTributoConta(Tributavel contaTributavel, Double taxa) {
        return contaTributavel.calcularTributo(taxa);
    }
}
