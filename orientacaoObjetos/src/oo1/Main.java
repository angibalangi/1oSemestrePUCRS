package oo1;
import oo1.Retangulo;
public class Main {
    public static void main (String args[]){
        Retangulo r1 = new Retangulo();
        System.out.println("Retângulo 1");
        System.out.println(r1.toString());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perímetro: " + r1.getPerimetro());
        System.out.println("Pitágoras: " + r1.getHipotenusa());
        Retangulo r2 = new Retangulo(100, 200);
        System.out.println("Retângulo 2");
        System.out.println(r2.toString());
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perímetro: " + r2.getPerimetro());
        System.out.println("Pitágoras: " + r2.getHipotenusa());

    }
}
