package oo4;
import java.util.Scanner;
public class Aluno {
    private String nome;
    private int matricula;
    private double frequencia;
    private double p1;
    private double p2;
    private double exercicios;
    private double trabalhoFinal;
    private double g1;
    private double g2;

    public Aluno(){
        nome = "Angelo Berleze";
        matricula = 26102194;
        frequencia = 100;
        p1 = 10;
        p2 = 10;
        exercicios = 10;
        trabalhoFinal = 10;
        g1 = (p1 + exercicios + (p2 * 2) + trabalhoFinal) / 5;
        g2 = 5;
    }
    public Aluno(String nome, int matricula,  double frequencia, double p1, double p2, double exercicios, double trabalhoFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.frequencia = frequencia;
        this.p1 = p1;
        this.p2 = p2;
        this.exercicios = exercicios;
        this.trabalhoFinal = trabalhoFinal;
        this.g1 = g1;
        this.g2 = g2;
    }
    public boolean passouG1 () {
        g1 = (p1 + exercicios + (p2 * 2) + trabalhoFinal) / 5;
        return g1 >= 7 && frequencia > 75;
    }
    public boolean falhouG2 () {
        g1 = (p1 + exercicios + (p2 * 2) + trabalhoFinal) / 5;
        return g1 < 4 || frequencia < 75;
    }
    public void g2Check () {
        Scanner in = new Scanner(System.in);
        if (passouG1()) { System.out.println("Você não precisa fazer G2."); }
        else {
            System.out.println("Você precisa fazer G2.");
            if (falhouG2()) {
                g1 = 5;
                System.out.println("Suas notas foram ajustadas para que você fosse elegível para G2.");
            }
            System.out.println("Informe sua nota da prova da G2: ");
            g2 = in.nextDouble();
            if (g2+g1/2 >= 5) System.out.println("Você passou!");
            else System.out.println("Você não passou...");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }
    public double getP1() {
        return p1;
    }
    public void setP1(double p1) {
        this.p1 = p1;
    }
    public double getP2() {
        return p2;
    }
    public void setP2(double p2) {
        this.p2 = p2;
    }
    public double getExercicios() {
        return exercicios;
    }
    public void setExercicios(double exercicios) {
        this.exercicios = exercicios;
    }
    public double getTrabalhoFinal() {
        return trabalhoFinal;
    }
    public void setTrabalhoFinal(double trabalhoFinal) {
        this.trabalhoFinal = trabalhoFinal;
    }
}
