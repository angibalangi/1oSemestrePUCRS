package oo6;
import java.util.Scanner;

public class App3 {
   public void main (String[]args )
   {
      Scanner in =new Scanner(System.in);
      Pessoa eu, nos;
      Aluno tu;
      AlunoGrad ele;
      Professor prof;

      System.out.println("\f");
      System.out.println("Digite nome ");
      String nome1= in.nextLine();
      System.out.println("Digite endereco ");
      String endereco1= in.nextLine();
      System.out.println("Digite nome da mãe ");
      String mae1= in.nextLine();
      System.out.println("Digite nome do pai");
      String pai1= in.nextLine();
      System.out.println("Digite cidade onde nasceu ");
      String cidade1= in.nextLine();
      System.out.println("Digite dia que nasceu ");
      int dia1= in.nextInt();
      System.out.println("Digite mes que nasceu ");
      int mes1= in.nextInt();
      System.out.println("Digite ano que nasceu ");
      int ano1= in.nextInt();
      System.out.println("Digite RG ");
      int rg1= in.nextInt();
      System.out.println("Digite CPF ");
      int cpf1= in.nextInt();
      //instanciando o objeto pessoa
      eu=new Pessoa( nome1,endereco1,cidade1,dia1,mes1,ano1,cpf1,rg1);
      /// comecando as informações para o 2o objeto
      in.nextLine();
      System.out.println("Digite nome do curso ");
      String curso1= in.nextLine();
      System.out.println("Digite quantidade de creditos matriculados ");
      int creditos1= in.nextInt();
      System.out.println("Digite o semestre em que se  matriculou ");
      int semestre1= in.nextInt();
      //instanciando o objeto aluno
      tu=new Aluno(eu, curso1,creditos1,semestre1);
      in.nextLine();
      System.out.println("D");

      System.out.println ("dados do Aluno Matriculado");
      System.out.println (" **************************");

      System.out.println (tu);

      System.out.println ("nome do Aluno Matriculado"+ eu.getNome());
      System.out.println ("Fim de Programa");

      System.out.println("\f");
      System.out.println("Digite nome ");
      String nome2 = in.nextLine();
      System.out.println("Digite endereco ");
      String endereco2 = in.nextLine();
      System.out.println("Digite nome da mãe ");
      String mae2= in.nextLine();
      System.out.println("Digite nome do pai");
      String pai2= in.nextLine();
      System.out.println("Digite cidade onde nasceu ");
      String cidade2 = in.nextLine();
      System.out.println("Digite dia que nasceu ");
      int dia2 = in.nextInt();
      System.out.println("Digite mes que nasceu ");
      int mes2 = in.nextInt();
      System.out.println("Digite ano que nasceu ");
      int ano2 = in.nextInt();
      System.out.println("Digite RG ");
      int rg2 = in.nextInt();
      System.out.println("Digite CPF ");
      int cpf2 = in.nextInt();
      //instanciando o objeto pessoa
      eu=new Pessoa(nome2, endereco2, cidade2, dia2, mes2, ano2, cpf2, rg2);
   }
}