public class ContaEspecial extends ContaBancaria{
    public ContaEspecial(String numero, String agencia){
        super(numero, agencia);
    }

    public ContaEspecial(){
        super("", "agencia");
    }
    public static void main(String[] args) {
        ContaEspecial contaEspecial = new ContaEspecial("123456", "XALALA");
        contaEspecial.getAgencia();
    }
    

}
