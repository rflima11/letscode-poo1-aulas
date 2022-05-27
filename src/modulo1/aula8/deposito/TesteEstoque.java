package modulo1.aula8.deposito;

public class TesteEstoque {

    public static void main(String[] args) {

        Celular motorola = new Celular("MOTOG13", 1500);
        Celular iphone = new Celular("IPHONE 13", 13000);

        String.valueOf(1F);
        EstoqueCelular estoqueCelular = new EstoqueCelular();

        estoqueCelular.adicionarItemAoEstoque(motorola);
        estoqueCelular.adicionarItemAoEstoque(iphone);

        estoqueCelular.listarProdutos();



        Animal doguinho2 = new Cachorro();


    }
}
