public class ContaCorrente extends ContaBancaria{
    private double chequeEspecial;
    private double pacoteServico;

    public ContaCorrente(String numero, String agencia){
        super(numero, agencia);
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

}
