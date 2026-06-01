public class array4 {
    public static void main(String[] args) {
        String texto = "Árvore";
        char[] array = {'Á','r','v','o','r','e'};
        comparacao(array,texto);
    }
    public static void print(char[] array){
        for (int i=0;  i<array.length; i++){
            System.out.print(array[i]);
        }
    }
    public static int tamanho(char[] array){
        return  array.length;
    }
    public static char caractereNaPosicao(char[] array, int posicao){
        if (posicao < 0 || posicao > array.length) return 'X';
        else return array[posicao];
    }
    public static boolean vazio(char[] array){
        if  (array.length == 0) return true;
        else return false;
    }
    public static void alterar(char[] array,int posicao, char alt){
        array[posicao] = alt;
    }
    public static char[] inserirInicio(char[] array, char ini){
        char[] newArray = new char[array.length + 1];
        newArray[0] = ini;
        for (int i = 1; i < array.length; i++){
            newArray[i] = array[i-1];
        }
        return newArray;
    }
    public static char[] inserirFim(char[] array, char fim){
        char[] newArray = new char[array.length + 1];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        newArray[array.length] = fim;
        return newArray;
    }
    public static char[] inserirPosicao(char[] array, int posicao, char novo){
        char[] newArray = new char[array.length + 1];
        newArray[posicao] = novo;
        for  (int i = 0; i < posicao; i++){
            newArray[i] = array[i];
        }
        for (int i = posicao; i < array.length; i++){
            newArray[i+1] = array[i];
        }
        return newArray;
    }
    public static char[] removerInicio(char[] array){
        char[] newArray = new char[array.length - 1];
        for (int i = 1; i < array.length; i++){
            newArray[i-1] = array[i];
        }
        return newArray;
    }
    public static char[] removerFim(char[] array){
        char[] newArray = new char[array.length - 1];
        for (int i = 0; i<(array.length-1); i++){
            newArray[i] = array[i];
        }
        return newArray;
    }
    public static char[] removerPosicao(char[] array, int posicao){
        char[] newArray = new char[array.length - 1];
        for (int i = 0; i<posicao; i++){
            newArray[i] = array[i];
        }
        for (int i = posicao; i < array.length; i++){
            newArray[i-1] = array[i];
        }
        return newArray;
    }
    public static boolean contem(char[] array, char check){
        boolean contem=false;
        for (int i = 0; i<array.length; i++){
            if (array[i] == check){
                contem = true;
            }
        }
        return contem;
    }
    public static int posicaoDe(char[] array, char check){
        for (int i = 0; i<array.length; i++){
            if (array[i] == check){
                return i;
            }
        }
        return -1;
    }
    public static char[] limpar(char[] array){
        char[] newArray = new char[array.length];
        return newArray;
    }
    public static char[] copiarParte(char[] array, int ini, int fim){
        char[] newArray = new char[(array.length-ini)-(array.length-fim)];
        for (int i = ini; i<fim; i++){
            newArray[i-ini] = array[i];
        }
        return newArray;
    }
    public static void comparacao(char[] array, String texto){
        System.out.println(texto.length());
        System.out.println(tamanho(array));
        System.out.println(texto.charAt(0));
        System.out.println(caractereNaPosicao(array, 0));
        if (texto.isEmpty()) System.out.println("Vazio");
        else System.out.println("Não vazio");
        if (vazio(array)) System.out.println("Vazio");
        else System.out.println("Não vazio");
        if (texto.contains("A")) System.out.println("Contém A");
        else System.out.println("Não contém A");
        if (contem(array, 'a')) System.out.println("Contém A");
        else System.out.println("Não contém A");
        System.out.println(texto.indexOf("A"));
        System.out.println(posicaoDe(array, 'A'));
        System.out.println(texto.substring(1,array.length-1));
        char[] substring = copiarParte(array, 1, array.length-1);
        for (int i = 0; i<substring.length; i++){
            System.out.print(substring[i]);
        }
    }
}
