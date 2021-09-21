
public class Televisao {
    private int volume;
    private int canal;

    Televisao(){
        this.volume = 50;
        this.canal = 12;
    }

    Televisao(int volume, int canal){
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void aumentaVolume(){
        this.volume++;
    }

    public void diminuiVolume(){
        this.volume--;
    }

    public void aumentaCanal(){
        this.canal++;
    }

    public void diminuiCanal(){
        this.canal--;
    }
}