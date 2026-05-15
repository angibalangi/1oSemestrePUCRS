package oo5;
public class Conta {
    private String numero;
    private double saldo;

    public Conta() {
        numero = "999";
        this.saldo = 0.0;
    }
    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public String calculaNumero() {
        String numero = "";
        String valor = "";
        numero += numero.charAt(2);
        numero += (numero.charAt(1) * 10);
        numero += (numero.charAt(0) * 100);
        valor += (valor.charAt(0));
        valor += (valor.charAt(1) * 2);
        valor += (valor.charAt(2) * 3);
        String valorFinal = "";
        valorFinal += valor.charAt(3);
        return valorFinal;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
}
