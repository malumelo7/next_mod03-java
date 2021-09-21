
public class ControleRemoto {
    private Televisao tv;
    

    ControleRemoto(){
        this.tv = new Televisao();
    }

    public void aumentaVolume(){
        this.tv.aumentaVolume();
    }

    public void diminuiVolume(){
        this.tv.diminuiVolume();
    }

    public void aumentaCanal(){
        this.tv.aumentaCanal();
    }

    public void diminuiCanal(){
        this.tv.diminuiCanal();
    }

    public void trocaCanal(int canal){
        this.tv.setCanal(canal);
    }

    public void consultaVolume(){
        System.out.println(this.tv.getVolume());
    }

    public void consultaCanal(){
        System.out.println(this.tv.getCanal());
    }
    
}