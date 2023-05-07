package Ex02;
public class Main {
    public static void main(String[] args){
        Triangulo triangulo = new Triangulo();
        Quadrado quadrado = new Quadrado();
        System.out.println("A área do triangulo é: " + triangulo.calcularArea(8,4));
        System.out.println("A área do quadrado é: " + quadrado.calcularArea(5, 9));
    }
}
