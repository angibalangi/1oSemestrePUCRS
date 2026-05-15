package oo2;
import oo2.Triangulo;
public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        System.out.println("Triângulo 1");
        System.out.println(t1.toString());
        System.out.println("Perímetro: " + t1.getPerimetro());
        System.out.println("Tipo: " + t1.getTipo());
        System.out.println("Área: " + t1.getArea());

        Triangulo t2 = new Triangulo(100, 150, 200);
        System.out.println("Triângulo 2");
        System.out.println(t2.toString());
        System.out.println("Perímetro: " + t2.getPerimetro());
        System.out.println("Tipo: " + t2.getTipo());
        System.out.println("Área: " + t2.getArea());

        Triangulo t3 = new Triangulo(100, 150, 100);
        System.out.println("Triângulo 3");
        System.out.println(t3.toString());
        System.out.println("Perímetro: " + t3.getPerimetro());
        System.out.println("Tipo: " + t3.getTipo());
        System.out.println("Área: " + t3.getArea());

    }
}