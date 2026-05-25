package oo6;
import oo6.Aluno;
public class AlunoGrad {
    Aluno alguem;
    private String curso;
    private String instituicao;
    private boolean temEmprego;
    private Double salario;
    private int semestre;
    public AlunoGrad(Aluno alguem, String curso, String instituicao, boolean emprego, Double salario,  int semestre) {
        this.alguem = alguem;
        this.instituicao = instituicao;
        this.salario = salario;
    }
    public void setCurso (String curso) {this.curso = curso;}
    public void setInstituicao(String instituicao) {this.instituicao = instituicao;}
    public void setTemEmprego(boolean temEmprego) {this.temEmprego = temEmprego;}
    public void setSalario(Double salario) {this.salario = salario;}
    public void setSemestre(int semestre) {this.semestre = semestre;}
    public String getCurso() {return this.curso;}
    public String getInstituicao() {return this.instituicao;}
    public boolean getTemEmprego() {return this.temEmprego;}
    public Double getSalario() {return this.salario;}
    public int getSemestre() {return this.semestre;}
}
