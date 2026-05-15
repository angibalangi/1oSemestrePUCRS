package oo4;
import oo4.Aluno;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Informe a nota na P1: ");
        aluno.setP1(in.nextDouble());
        System.out.println("Informe a nota na P2: ");
        aluno.setP2(in.nextDouble());
        System.out.println("Informe a média dos exercícios: ");
        aluno.setExercicios(in.nextDouble());
        System.out.println("Informe a nota no trabalho final: ");
        aluno.setTrabalhoFinal(in.nextDouble());
        System.out.println("Informe sua frequência (sem a %): ");
        aluno.setFrequencia(in.nextDouble());
        aluno.g2Check();
    }
}