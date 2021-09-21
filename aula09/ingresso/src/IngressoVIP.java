/**
 * IngressoVIP
 */
public class IngressoVIP extends Ingresso{

    private double valorAdicional;
    
    public IngressoVIP(){

    }
    
    public IngressoVIP(double valor){
        super(valor);
    }

    public IngressoVIP(double valor, double valorAdicional){
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return this.valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public String toString() {
        return String.valueOf(this.getValor() + this.valorAdicional);
    }
}