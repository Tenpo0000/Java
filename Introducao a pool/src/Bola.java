/*
➢ Crie uma classe Bola
➢ A classe deve possuir o atributo cor do tipo String
➢ A classe deve possuir os métodos getCor e setCor
➢ Faça o teste da classe
*/

public class Bola {
    private String color;

    public String getColor () {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public static void main (String[] args) {
        Bola bola = new Bola ();

        bola.setColor("blue");
        System.out.printf("ball color is: " + bola.getColor());
    }
}