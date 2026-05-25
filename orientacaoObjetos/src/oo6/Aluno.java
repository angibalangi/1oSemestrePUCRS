package oo6;
import oo6.Pessoa;
public class Aluno
{
    Pessoa alguem;
    private String curso;
    private int semestre, creditos;
    
    public Aluno(Pessoa alguem1, String curso1, int creditos1,int semestre1 )
    {
        alguem=alguem1;
        setCurso(curso1);
        setSemestre (semestre1);
        setCreditos(creditos1);
        
    }
    public void setCurso( String curso1){ curso=curso1;}
    public void setSemestre (int semestre1){semestre=semestre1;}
    public void setCreditos (int creditos1){ creditos=creditos1;}
    public String getCurso() { return curso;}
    public int getSemestre() { return semestre;}
    public int getCreditos(){ return creditos;}
    
    public String toString() { 
     return alguem+ "\n Esta cursando: "+curso + "\n no "+ semestre+ "\n semestre" +
       "\n fazendo "+ creditos + " creditos";
    }
    
}
