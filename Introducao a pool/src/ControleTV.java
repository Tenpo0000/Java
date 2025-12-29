/*
➢ Crie uma classe ControleTV
➢ A classe deve possuir os atributos canal e volume do tipo inteiro
➢ A classe deve possuir os métodos getCanal, setCanal,getVolume, aumentarVolume e reduzirVolume a o teste da classe
➢ Certifique-se de que o canal e o volume estejam sempre entre 0 e 100
*/

public class ControleTV {
    private int volume = 20;
    private int canal = 1;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 100) {
            volume = 100;
        } else if (this.volume <= 0 ){
            volume = 0;
        }

        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal >= 100) {
            canal = 100;
        } else if (canal <= 0 ){
            canal = 0;
        }

        this.canal = canal;
    }

    public int aumentarVolume(){
        if (volume >= 100) {
            volume = 99;
        }

        return volume ++;
    }

    public int diminuirVolume(){
        if(volume <= 0 ){
            volume = 1;
        }

        return volume --;
    }

    public int proximoCanal(){
        if (canal >= 100) {
            canal = 99;
        }

        return canal ++;
    }

    public int voltarCanal(){
        if(canal <= 0 ){
            canal = 1;
        }

        return canal --;
    }

    static void main(String[] args) {
        ControleTV controle = new ControleTV();

        controle.setCanal(-1000);
        System.out.printf("canal is: " + controle.getCanal());
        controle.proximoCanal();
        controle.proximoCanal();
        controle.proximoCanal();
        controle.voltarCanal();
        System.out.printf("\ncanal is: " + controle.getCanal());

        controle.setVolume(1000);
        System.out.printf("\n\nVolume is: " + controle.getVolume());
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.diminuirVolume();
        System.out.printf("\nVolume is: " + controle.getVolume());
    }
}
