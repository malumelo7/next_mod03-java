import java.util.Scanner;

/**
 * In this problem, your job is to read three Portuguese words. These words define an animal according to the table below, from left to right. After, print the chosen animal defined by these three words. 

- vertebrado    ->ave       ->carnivoro     ->aguia
                            ->onivoro       ->pombo
                ->mamifero  ->onivoro       ->homem
                            ->herbivoro     ->vaca
- invertebrado  ->inseto    ->hematofago    ->pulga
                            ->herbivoro     ->lagarta
                ->anelideo  ->hematofago    ->sanguessuga
                            ->onivoro       ->minhoca

Input

The input contains 3 words, one by line, that will be used to identify the animal, according to the above table, with all letters in lowercase.
Output

Print the animal name according to the given input.

Input Samples 	Output Samples

vertebrado      homem
mamifero
onivoro
	
vertebrado      aguia
ave
carnivoro
	
invertebrado    minhoca
anelideo
onivoro
 */
class Animal {
    String nome;
    String tipoEstrutura;
    String classificacaoAnimal;
    String habitosAlimentares;

    Animal(String nome, String tipoEstrutura, String classificacaoAnimal, String habitosAlimentares){
        this.nome = nome;
        this.tipoEstrutura = tipoEstrutura;
        this.classificacaoAnimal = classificacaoAnimal;
        this.habitosAlimentares = habitosAlimentares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String estrutura = sc.nextLine();
        String classificacao = sc.nextLine();
        String habitos = sc.nextLine();

        Animal[] db = {
            new Animal("aguia", "vertebrado", "ave", "carnivoro"),
            new Animal("pomba","vertebrado", "ave", "onivoro"),
            new Animal("homem", "vertebrado", "mamifero", "onivoro"),
            new Animal("vaca", "vertebrado", "mamifero", "herbivoro"),
            new Animal("pulga", "invertebrado", "inseto", "hematofago"),
            new Animal("lagarta", "invertebrado", "inseto", "herbivoro"),
            new Animal("sanguessuga", "invertebrado", "anelideo", "hematofago"),
            new Animal("minhoca", "invertebrado", "anelideo", "onivoro")
        };

        for (Animal animal : db) {
            if(estrutura.equals(animal.tipoEstrutura) && classificacao.equals(animal.classificacaoAnimal) && habitos.equals(animal.habitosAlimentares)){
                System.out.println(animal.nome);
                break;
            }
        }
        sc.close();
    }
}
