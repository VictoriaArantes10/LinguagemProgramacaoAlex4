
package Exercicio4;

public class TV  {
    
    private int canal;
    private int volume;
    private boolean ligada;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
        this.canal=0;
        this.volume = 0;
        this.ligada = false;
                
    }

  
   
    
    
    
}
