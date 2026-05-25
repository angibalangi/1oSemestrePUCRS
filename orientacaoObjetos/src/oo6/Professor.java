package oo6;
import oo6.Pessoa;
public class Professor {
    Pessoa alguem;
    private String materia;
    private String instituicao;
    private double salario;
    public Professor(Pessoa alguem, String materia, String instituicao, double salario) {
        this.alguem = alguem;
        this.materia = materia;
        this.instituicao = instituicao;
        this.salario = salario;
    }
    public void setMateria(String materia) {this.materia = materia;}
    public void setInstituicao(String instituicao) {this.instituicao = instituicao;};
    public void setSalario(double salario) {this.salario = salario;};
    public String  getMateria() {return this.materia;};
    public String getInstituicao() {return this.instituicao;};
    public double getSalario() {return this.salario;};
}

