import java.util.ArrayList;

/**
 04. Faça um programa de agenda telefônica, com as classes Agenda e Contato.
 */
public class Agenda {
    ArrayList<Contato> agenda;
    //Construtor que recebe uma lista de contato
    Agenda(ArrayList<Contato> listaContato){

        this.agenda = listaContato;
    }
    
    // Contrutor que inicia uma lista de contato vazia
    Agenda(){
        this.agenda = new ArrayList<>();
    }

    public void adicionaContato(Contato contato){
        this.agenda.add(contato);
    }

    public void removeContato(Contato contato){
        agenda.remove(contato);
    }

    public void exibeContato(String nome){
        for (Contato contato : agenda) {
            if(nome.equals(contato.getNome())){
                System.out.println("Nome: " + contato.getNome());
                System.out.println("Telefone: " + contato.getNumero());
            }
        }
    }

    public void exibeListaContato(){
        for (Contato contato : agenda) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getNumero());
        }
    }
}