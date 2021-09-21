public class Elevador {
    private int andarAtual = 0;
    private int totalAndares;
    private double capacidadeElevador;
    private int pessoasPresentes = 0;

    public int getAndarAtual() {
        return this.andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return this.totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public double getCapacidadeElevador() {
        return this.capacidadeElevador;
    }

    public void setCapacidadeElevador(double capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getPessoasPresentes() {
        return this.pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    void inicializa(double capacidadeElevador, int totalAndares){
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
    }

    void entra(){
        if(pessoasPresentes <= capacidadeElevador){
            pessoasPresentes++;
        }
    }

    void sai(){
        if(pessoasPresentes > 0){
            pessoasPresentes--;
        }
    }

    void sobe(){
        if(andarAtual < totalAndares){
            andarAtual++;
        }
    }

    void desce(){
        if(andarAtual >= 1){
            andarAtual--;
        }
    }

    void andarAtual(){
        System.out.println(andarAtual);
    }
}
