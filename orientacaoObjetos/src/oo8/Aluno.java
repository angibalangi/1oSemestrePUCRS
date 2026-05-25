package oo8;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private boolean emprestado;
    public Aluno (String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.emprestado = false;
    }
    public String getNome() {return nome;}
    public int getMatricula() {return matricula;}
    public String getCurso() {return curso;}
    public boolean getEmprestado() {return emprestado;}
    public void setNome(String nome) {this.nome = nome;}
    public void setMatricula (int matricula) {this.matricula = matricula;}
    public void setCurso(String curso) {this.curso = curso;}
    public void setEmprestado(boolean emprestado) {this.emprestado = emprestado;}
    public void exibirDados(){
        System.out.println("Nome do Aluno: " + nome+ "\nCurso: "+curso+ "\nMatrícula: "+matricula);
    }
}
