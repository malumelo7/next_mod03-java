public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String numero, String agencia){
        super(numero, agencia);
    }

    private static double taxaRendimento;

    public static double getTaxaRendimento() {
		return taxaRendimento;
	}

    public static void setTaxaRendimento(double taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

    public void rendimento(){
        double rendimento = this.getSaldo()*ContaPoupanca.getTaxaRendimento();
        this.setSaldo(this.getSaldo() + rendimento);
    }

    public void rendimentoBonus(double taxaBonus){
        double rendimentoBonus = this.getSaldo()*taxaBonus;
        this.setSaldo(this.getSaldo() + rendimentoBonus);
    }

    public static void main(String[] args) {
        ContaPoupanca p = new ContaPoupanca("123123", "OI");
        p.getAgencia();
    }
}
