import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Human {
    private String nome;
    private String dataNascimento;
    private double altura;

    Human (String nome, String dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void exibeHumano(Human pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Data de nascimento: " + pessoa.getDataNascimento());
        System.out.println("Altura: " + pessoa.getAltura());
    }

    public Long getIdade(Human pessoa){

        String[] dataNascimento = pessoa.getDataNascimento().split("-");

        LocalDate start = LocalDate.of(Integer.parseInt(dataNascimento[2]), Integer.parseInt(dataNascimento[1]), Integer.parseInt(dataNascimento[0]));
        LocalDate end = LocalDate.now();
        Long age = ChronoUnit.YEARS.between(start, end);    
        return age;
    }
}