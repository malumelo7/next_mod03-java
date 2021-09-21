import java.util.ArrayList;

public class Agenda{
    
    ArrayList<Pessoa> agenda;

    Agenda(ArrayList<Pessoa> listaPessoas){
        this.agenda = listaPessoas;
    }

    void armazenaPessoa(String nome, int idade, double altura){
        if(agenda.size() <= 10){
            Pessoa pessoa = new Pessoa(nome, idade, altura);
            this.agenda.add(pessoa);
        }
    }

    void removePessoa(String nome){
        for(Pessoa pessoa: agenda){
            if(nome.equals(pessoa.getNome())){
                agenda.remove(pessoa);
                break;
            }
        }
    }

    int buscaPessoa(String nome){
        for (Pessoa pessoa: agenda){
            if(nome.equals(pessoa.getNome())){
                return agenda.indexOf(pessoa);
            }
        }
        return -1;
    }

    void imprimeAgenda(){
        for(Pessoa pessoa: agenda){
            System.out.println(agenda.indexOf(pessoa) + " - Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Altura: " + pessoa.getAltura());
        }
    }

    void imprimePessoa(int index){
        if(index < agenda.size()){
            System.out.println(index + " - Nome: " + agenda.get(index).getNome());
            System.out.println("Idade: " + agenda.get(index).getIdade());
            System.out.println("Altura: " + agenda.get(index).getAltura());
        }
    }
}