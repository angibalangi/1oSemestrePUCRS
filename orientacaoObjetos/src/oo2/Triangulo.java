public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo() {
        lado1 = 1;
        lado2 = 1;
        lado3 = 1;
    }
    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public double getLado1() { return lado1; }
    public double getLado2() { return lado2; }
    public double getLado3() { return lado3; }
    public void setLado1(double lado1) { this.lado1 = lado1; }
    public void setLado2(double lado2) { this.lado2 = lado2; }
    public void setLado3(double lado3) { this.lado3 = lado3; }
    public String toString() { return "Lado 1: " + lado1 + " Lado 2: " + lado2 + " Lado 3: " + lado3; }
    public String getTipo() {
        if (lado1 == lado2 && lado2 == lado3) return "Equilátero";
        else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) return "Isósceles";
        else return "Escaleno";
    }
    public double getPerimetro() { return (lado1+lado2+lado3); }
    public double getArea() {
        double h, b = 1, a = 1;
        if (lado1 == lado2) {
            a = lado1;
            b = lado3;
        }
        else if (lado1 == lado3) {
            a = lado1;
            b = lado2;
        }
        else if (lado2 == lado3) {
            a = lado2;
            b = lado1;
        }
        if (toString() == "Equilátero") { return Math.pow(lado1, 2) * Math.sqrt(3)/4; }
        else if (toString() == "Isósceles") {
            h = Math.sqrt(Math.pow(a, 2)-Math.pow(b, 2)/4);
            return b*h/2;
        }
        else return Math.sqrt((getPerimetro()/2)*((getPerimetro()/2)-lado1)*((getPerimetro()/2)-lado2)*((getPerimetro()/2)-lado3));
    }


}
