package oo8;
import oo8.*;
import java.util.HashMap;
import java.util.Scanner;

public class Biblioteca {
    HashMap<String,Emprestimo> hm = new HashMap<>();
    HashMap<String,Aluno> lhm = new HashMap<>();
    Scanner in = new Scanner(System.in);
    private String nome;
    public void registrarEmprestimo(String data, Aluno aluno, Livro livro) {
        if (aluno.getEmprestado()) {
            System.out.println("Você já pegou um livro emprestado. Devolva antes de pegar outro.");
        } else {
            if (livro.getDisponivel()) {
                hm.put("emp" + livro.getCodigo(), new Emprestimo(livro.getCodigo(), aluno.getNome(), data, false));
                livro.setDisponivel(false);
                aluno.setEmprestado(true);
                System.out.println("Empréstimo concluído com sucesso!");
            } else {
                System.out.println("O livro não está disponível");
            }
        }
    }
    public void devolverLivro(int codigo, Aluno aluno){
        if (hm.containsKey("emp"+codigo)){
            if (aluno.getEmprestado()) {
                hm.get("emp"+codigo).registrarDevolucao();
                hm.remove("emp"+codigo);
            }
            else {
                System.out.print("Você não pegou nenhum livro emprestado");
            }
        }
        else {
            System.out.println("Código inválido.");
        }
    }
    public void mostrarEmprestimos() {
        for (Emprestimo obj : hm.values()) {
            obj.exibirEmprestimo();
        }
    }
}


