package oo8;
import java.util.Scanner;
import oo8.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Livro> lhm = new HashMap<>();
        HashMap<String, Aluno> ahm = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Biblioteca bibl = new Biblioteca();
        System.out.println("Informe a data de hoje: ");
        String data = in.nextLine();
        int l = 1;
        for (int i = 1; true; l++) {
            System.out.println("Selecione uma opção:" +
                    "\n1) Adicionar livro" +
                    "\n2) Fazer login");
            i = in.nextInt();
            switch (i) {
                case 1: {
                    in.nextLine();
                    System.out.println("Informe o nome do livro: ");
                    String lNome = in.nextLine();
                    System.out.println("Informe o autor do livro: ");
                    String lAutor = in.nextLine();
                    System.out.println("Informe o gênero do livro: ");
                    String lGenero = in.nextLine();
                    lhm.put(lNome, new Livro(lNome, lAutor, lGenero, l));
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                }
                case 2: {
                    in.nextLine();
                    System.out.println("Informe o seu nome: ");
                    String nome = in.nextLine();
                    if (ahm.containsKey(nome)) {
                        areaAluno(bibl, ahm.get(nome), lhm, data);
                    } else {
                        System.out.println("Informe a sua matrícula: ");
                        int matricula = in.nextInt();
                        in.nextLine();
                        System.out.println("Informe o seu curso: ");
                        String curso = in.nextLine();
                        ahm.put(nome, new Aluno(nome, matricula, curso));
                        System.out.println("Aluno adicionado com sucesso!");
                        areaAluno(bibl, ahm.get(nome), lhm, data);
                    }
                }
            }
        }
    }

    public static void areaAluno(Biblioteca bibl, Aluno aluno, HashMap<String, Livro> lhm, String data) {
        Scanner in = new Scanner(System.in);
        for (int i = 1; true; ) {
            System.out.println("Selecione uma opção:" +
                    "\n1) Pegar livro emprestado" +
                    "\n2) Ver livros emprestados" +
                    "\n3) Devolver livro" +
                    "\n4) Mostrar livros disponíveis");
            i = in.nextInt();
            switch (i) {
                case 1: {
                    in.nextLine();
                    System.out.println("Informe o nome do livro: ");
                    String lNome = in.nextLine();
                    if (lhm.containsKey(lNome)) {
                        bibl.registrarEmprestimo(data, aluno, lhm.get(lNome));
                    } else {
                        System.out.println("O livro não está no sistema");
                    }
                    break;
                }
                case 2: {
                    bibl.mostrarEmprestimos();
                    break;
                }
                case 3: {
                    in.nextLine();
                    System.out.println("Informe o nome do livro: ");
                    String lNome = in.nextLine();
                    if (lhm.containsKey(lNome)) {
                        bibl.devolverLivro(lhm.get(lNome).getCodigo(), aluno);

                    } else {
                        System.out.println("O livro não está no sistema");
                    }
                    break;
                }
                case 4: {
                    for (Livro obj : lhm.values()) {
                        obj.mostrarLivros();
                    }
                }
            }
        }
    }
}