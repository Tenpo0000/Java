/*
➢ Crie uma classe Quadrado
➢ A classe deve possuir o atributo lado do tipo inteiro
➢ A classe deve possuir os métodos getLado, setLado e calcularArea
➢ Faça o teste da classe
*/

public class Quadrado {
    private int lado;

    public int getLado(){
        return lado;
    }

    public void setLado(int lado){
        this.lado = lado;
    }

    public int calculaArea(){
        int resultado;
        resultado = lado * lado;
        return  resultado;
    }

    static void main(String[] args) {
        Quadrado quadrado = new Quadrado();

        quadrado.setLado(10);
        System.out.printf("the area is: " + quadrado.calculaArea());
    }
}
