package aula2;

 class TesteAgenda {

     public static void main(String[] args) {
         Agenda agenda = new Agenda(15);
         Contato contato = new Contato("6198572648", "rodolfo.dev@gmail.com");
         System.out.println(agenda.adicionarContato(contato));


         for(int i = 0; i < agenda.contatos.length; i++) {
             System.out.println("Contato: " + agenda.contatos[i].email + " " + agenda.contatos[i].telefone);
         }


     }
}
