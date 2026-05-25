package oo7;
import oo7.Jarro;
/**
 * Escreva a descri��o da classe App aqui.
 * 
 * @author (seu nome) 
 * @version (n�mero de vers�o ou data)
 */
public class App
{
    public static void main(String args[]){
        Jarro jarro1 = new Jarro(4);
        Jarro jarro2 = new Jarro(3);
        jarro2.encher();
        jarro2.despejar(jarro1);
        jarro2.encher();
        jarro2.despejar(jarro1);
        jarro1.esvaziar();
        jarro2.despejar(jarro1);
        System.out.println("Estado do Jarro2: " + jarro2.getLitros());
        System.out.println("Estado do Jarro1: " + jarro1.getLitros());
    }
}
