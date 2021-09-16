/**
 * Livro
 */
class Livro {

    private String titulo;
    String autor = "Xlala";
    private int quantidadeDePaginas;
    private int anoDeLancamento;
    private String artistaDeCapa;
    static String editora;

    public static void main(String[] args) {
        Livro livro1 = new Livro();

        Livro livro2 = new Livro();


        livro1.autor = "JK Rowling";
        livro2.editora = "ROCCO";

    }
}