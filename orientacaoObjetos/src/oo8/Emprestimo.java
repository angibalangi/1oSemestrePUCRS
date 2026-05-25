package oo8;
import oo8.*;

public class Emprestimo {
    private Livro l;
    private int livro = l.getCodigo();
    private String dataEmprestimo;
    private Aluno a;
    private boolean devolvido;
    public Emprestimo(int livro, String aluno, String dataEmprestimo, boolean devolvido) {
        this.livro = livro;
        a.setNome(aluno);
        this.dataEmprestimo = dataEmprestimo;
        this.devolvido = devolvido;
    }
    public void exibirEmprestimo(){
        System.out.println("O aluno "+a.getNome()+" retirou o livro "+livro+" em " +dataEmprestimo);
        if (devolvido){
            System.out.println("Devolvido: Sim");
        }
        else {
            System.out.println("Devolvido: Não");
        }
    }
    public void registrarDevolucao(){
            this.devolvido=true;
            l.setDisponivel(true);
            System.out.println("O livro foi devolvido com sucesso");
        }
    }