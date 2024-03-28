public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void aumentarCanal() {
        canal++;
    }
    public void dimunirCanal() {
        canal--;
    }
    public void mudarDeCanal(int novoCanal) {
        canal = novoCanal;
    }
    public void aumentarVolume() {
        volume++;
        System.out.println(volume);
    }
    public void diminuirVolume() {
        volume--;
        System.out.println(volume);
    }
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada =  false;
    }


}
