package oo6;
import oo6.*;
import java.util.Scanner;
public class App2{
    
        
                      
    public void main (String[]args )
    {
       Scanner entrada=new Scanner(System.in);
       Pessoa eu;
             
       System.out.println("\f");
       System.out.println("\n Digite nome ");
       String nome1=entrada.nextLine();
       System.out.println("\n Digite endereco ");
       String endereco1=entrada.nextLine();
       System.out.println("\n Digite cidade onde nasceu ");
       String cidade1=entrada.nextLine();
       System.out.println("\n Digite dia que nasceu ");
       int dia1=entrada.nextInt();
       System.out.println("\n Digite mes que nasceu ");
       int mes1=entrada.nextInt();
       System.out.println("\n Digite ano que nasceu ");
       int ano1=entrada.nextInt();
       System.out.println("\n Digite RG ");
       int rg1=entrada.nextInt();
       System.out.println("\n Digite CPF ");
       int cpf1=entrada.nextInt();
       //instanciando o objeto pessoa
       eu=new Pessoa( nome1,endereco1,cidade1,dia1,mes1,ano1,cpf1,rg1);
                        
       System.out.println ("\n dados da pessoa");
       System.out.println (" **************************");
       
       System.out.println (eu);
       System.out.println ("\n Fim de Programa");
       
}
}