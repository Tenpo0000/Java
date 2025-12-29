/*
➢ Crie uma classe Retangulo
➢ A classe deve possuir os atributos base e altura do tipo inteiro
➢ A classe deve possuir os métodos getBase, setBase, getAltura,setAltura, calcularArea e calcularPerimetro
➢ Faça o teste da classe
*/

public class Retangulo {
    private int altura;
    private int base;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int calculaArea(){
        int resultado;
        resultado = altura * base;
        return resultado;
    }

    public int calculaPerimetro(){
        int resultado;
        resultado = (altura + base) * 2;
        return resultado;
    }

    static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.setAltura(10);
        retangulo.setBase(10);
        System.out.printf("retangulo area is: " + retangulo.calculaArea());
        System.out.printf("\nretangulo perimeter is: " + retangulo.calculaPerimetro());
    }
}