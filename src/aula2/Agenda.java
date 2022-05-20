package aula2;

class Agenda {

    Contato[] contatos;
    int numeroMaximoDeContato;
    int contador = 0;

    Agenda(int numeroContatos) {
        contatos = inicializaAgenda(numeroContatos);
    }

    Contato[] inicializaAgenda(int numeroMaximoDeContato) {
       System.out.println("Agenda inicializada, número de contatos: " + numeroMaximoDeContato);
       return new Contato[numeroMaximoDeContato];
    }

    String adicionarContato(Contato contatoQualquer) {
        if (contador < contatos.length) {
            contatos[contador] = contatoQualquer;
            contador++;
            return "Contato " + contatoQualquer.email + " adicionado com sucesso!";
        }
        return "Não foi possível adicionar o contato a agenda, não há mais espaço";

    }

}
