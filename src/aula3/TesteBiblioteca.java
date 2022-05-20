package aula3;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class TesteBiblioteca {


    public static void main(String[] args) {
        new Biblioteca();
        new Biblioteca();
        new Biblioteca();


        List<String> oi = new ArrayList<>();
        System.out.println("Foram criadas " + Biblioteca.contador + " instancias de biblioteca");

    }
}
