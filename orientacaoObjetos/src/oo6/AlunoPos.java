package oo6;
import oo6.Aluno;
public class AlunoPos
{
    Aluno alguem;
    private String orientador, linha;
    
    
    public AlunoPos(Aluno alguem1, String orientador1, String linha1 )
    {
        alguem=alguem1;
        setOrientador(orientador1);
        setLinha(linha1);
            }
            
    public void setOrientador( String orientador1){ orientador=orientador1;}
    public void setLinha (String linha1){linha=linha1;}
    
    public String getOrientador() { return orientador;}
    public String getLinha() { return linha;}
    
        
    public String toString() { 
     return alguem+ "\n Esta sendo orientado por : "+ orientador+ "\n na linha de pesquisa "+ linha;
    }
    
}
