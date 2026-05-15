//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class retangulo {
    private double base;
    private double altura;

    public retangulo(){
        base = 1.0;
        altura = 0.5;
    }

    public retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase () {
        return base;
    }

    public void setBase (double base){
        this.base = base;
    }

    public double getAltura (){
        return altura;
    }

    public void setAltura (double altura){
        this.altura = altura;
    }

    public double getArea (){
        return base * altura;
    }

    public double getPerimetro (){
        return base*2 + altura*2;
    }

    public double getHipotenusa (){
        return Math.sqrt(base*base+altura*altura);
    }

    public String toString (){
        return "Base: " + base + " Altura: " + altura;
    }
}