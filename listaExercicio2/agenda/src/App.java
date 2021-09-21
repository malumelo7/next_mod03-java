import java.util.ArrayList;

/**
Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as
seguintes operações:
void armazenaPessoa(String nome, int idade, float altura);
void removePessoa(String nome);
int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da
agenda.
 */

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        Agenda agenda = new Agenda(listaPessoas);

        //Testes dos métodos
        agenda.armazenaPessoa("Malu", 23, 1.67);
        agenda.armazenaPessoa("Borba", 22, 1.78);
        agenda.armazenaPessoa("Nesha", 18, 2.0);

        agenda.imprimeAgenda();

        agenda.removePessoa("Nesha");

        agenda.imprimeAgenda();

        agenda.imprimePessoa(1);
    }
}
