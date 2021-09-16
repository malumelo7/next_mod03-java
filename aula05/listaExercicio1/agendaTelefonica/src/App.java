import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //Cria agenda com contatos
        
        Agenda agenda = new Agenda(new ArrayList<Contato>(){
            {
                add(new Contato("Malu", 123));
                add(new Contato("xalala", 456));
            }
        });

        //Adiciona na agenda
        agenda.adicionaContato(new Contato("xixixi", 1515));
        
        agenda.exibeListaContato();

        Agenda agenda2 = new Agenda();
        agenda2.adicionaContato(new Contato("Matheus", 456456));
        agenda2.exibeListaContato();

    }
}
