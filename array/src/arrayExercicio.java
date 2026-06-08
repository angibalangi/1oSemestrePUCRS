import java.security.cert.CertPathValidatorException;
import java.util.Random;
import java.util.Scanner;

public class arrayExercicio {
    public static void main(String args[]) {
        int[] sensor1 = rnd();
        int[] sensor2 = rnd();
        for (int i = 1; i != 0; ) {
            System.out.println("Escolha uma das seguintes opções:\n" +
                    "1) Subtrair dados dos sensores\n" +
                    "2) Trocar posições pares e ímpares de um vetor\n" +
                    "3) Substituir valores das posições pares por -2 e ímpares por -1\n" +
                    "4) Concatenar os dados dos dois sensores\n" +
                    "5) Clonar um vetor\n" +
                    "6) Calcular a intersecção dos dados\n" +
                    "7) Gerar a união dos dados\n" +
                    "8) Inserir um novo dado no vetor\n" +
                    "9) Remover um dado do vetor\n" +
                    "10) Exibir todos os vetores criados/modificados\n");
            i = in();
            switch (i) {
                case 1: {
                    boolean j = escolhaVetor();
                    if (j) sensor1 = subtrairVetor(sensor1, sensor2);
                    else sensor2 = subtrairVetor(sensor1, sensor2);
                    System.out.println("Processo concluído.");
                    break;
                }
                case 2: {
                    boolean j = escolhaVetor();
                    if (j) sensor1 = trocarLugar(sensor1);
                    else sensor2 = trocarLugar(sensor2);
                    System.out.println("Processo concluído.");
                    break;

                }
                case 3: {
                    boolean j = escolhaVetor();
                    if (j) sensor1 = substituirParImpar(sensor1);
                    else sensor2 = substituirParImpar(sensor2);
                    System.out.println("Processo concluído.");
                    break;
                }
                case 4: {
                    concactenar(sensor1, sensor2);
                    System.out.println("\nProcesso concluído");
                    break;
                }
                case 5: {
                    boolean j = escolhaVetor();
                    if (j) sensor1 = sensor2;
                    else sensor2 = sensor1;
                    System.out.println("Processo concluído.");
                    break;
                }
                case 6: {
                    interseccao(sensor1, sensor2);
                    System.out.println("\nProcesso concluído.");
                    break;
                }
                case 7: {
                    boolean j = escolhaVetor();
                    if (j) sensor1 = uniao(sensor1, sensor2);
                    else sensor2 = uniao(sensor1, sensor2);
                    System.out.println("Processo concluído.");
                    break;
                }
                case 8: {
                    boolean j = escolhaVetor();
                    Scanner in = new Scanner(System.in);
                    if (j) {
                        System.out.println("Informe a posição (1 a "+ sensor1.length +"): ");
                        int posicao = in.nextInt()-1;
                        System.out.println("Informe o valor");
                        int valor = in.nextInt();
                        sensor1 = inserir(sensor1, posicao, valor);
                        System.out.println("Processo concluído.");
                    }
                    else {
                        System.out.println("Informe a posição (1 a "+ sensor2.length +"): ");
                        int posicao = in.nextInt()-1;
                        System.out.println("Informe o valor");
                        int valor = in.nextInt();
                        sensor2 = inserir(sensor2, posicao, valor);
                        System.out.println("Processo concluído.");

                    }
                }
                case 9: {
                    boolean j = escolhaVetor();
                    Scanner in = new Scanner(System.in);
                    if (j) {
                        System.out.println("Informe a posição (1 a "+ sensor1.length +"): ");
                        int posicao = in.nextInt()-1;
                        sensor1 = remover(sensor1, posicao);
                        System.out.println("Processo concluído.");

                    }
                    else {
                        System.out.println("Informe a posição (1 a "+ sensor2.length +"): ");
                        int posicao = in.nextInt()-1;
                        System.out.println("Informe o valor");
                        int valor = in.nextInt();
                        sensor2 = remover(sensor2, posicao);
                        System.out.println("Processo concluído.");

                    }
                }
                case 10: {
                    print (sensor1);
                    System.out.print("\n");
                    print (sensor2);
                    System.out.println("\nProcesso concluído.");
                }
            }
            }
        System.out.println("TempTracker por Angelo Berleze");
        System.out.println("PROCESSO ENCERRADO");
        }


    public static int in() {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        while (i < 0 || i > 10) {
            System.out.println("OPÇÃO INVÁLIDA.");
            i = in.nextInt();
        }
        return i;
    }

    public static int[] rnd() {
        Random rnd = new Random();
        int[] n = new int[10];
        for (int i = 0; i < n.length; i++) {
            n[i] = rnd.nextInt(101);
        }
        return n;
    }

    public static boolean escolhaVetor() {
        System.out.println("Escolha o sensor para trocar:\n" +
                "1) Sensor 1;\n" +
                "2) Sensor 2;\n");
        int i = in();
        while (i < 1 || i>2) {
            System.out.println("OPÇÃO INVÁLIDA.");
            i = in();
        }
        if (i == 1) return true;
        else return false;
    }

    // MÉTODO SUBTRAÇÃO (CASE 1)
    public static int[] subtrairVetor(int[] n1, int[] n2) {
        int[] soma = new int[n1.length];
        for (int i = 0; i < n1.length; i++) {
            soma[i] = n1[i] - n2[i];
        }
        return soma;
    }

    // MÉTODO TROCA DE PARES/ÍMPARES (CASE 2)
    public static int[] trocarLugar(int[] n) {
        for (int i = 0; i < n.length; i++) {
            if (n.length % 2 != 0 && n[i + 1] == n.length) {
                return n;
            }
            int sub = n[i];
            n[i] = n[i + 1];
            n[i + 1] = sub;
            i++;
        }
        return n;
    }

    public static int[] substituirParImpar(int[] n) {
        for (int i = 0; i < n.length; i++) {
            if (i % 2 == 0) {
                n[i] = -2;
            } else n[i] = -1;
        }
        return n;
    }

    public static int[] uniao(int[] n1, int[] n2) {
        int[] uni = new int[n1.length + n2.length];
        for (int i = 0; i < uni.length; i++) {
            if (i <= n1.length) {
                uni[i] = n1[i];
            } else uni[i] = n2[i];
        }
        return uni;
    }

    public static void concactenar(int[] n1, int[] n2) {
        for (int i = 0; i < n1.length + n2.length; i++) {
            if (i <= n1.length) {
                System.out.print(n1[i]);
            } else System.out.print(n2[i]);
        }
    }
    public static void interseccao(int[] n1, int[] n2) {
        for (int i = 0; i < n1.length + n2.length; i++) {
            if (n1[i] == n2[i]) {
                System.out.print(n1[i]+ " ");
            }
        }
    }
    public static int[] inserir(int[] n, int posicao, int valor){
        int[] nv = new int[n.length + 1];
        nv[posicao] = valor;
        for  (int i = 0; i < posicao; i++){
            nv[i] = n[i];
        }
        for (int i = posicao; i < n.length; i++){
            nv[i+1] = n[i];
        }
        return nv;
    }
    public static int[] remover(int[] n, int posicao){
        int[] nv = new int[n.length - 1];
        for  (int i = 0; i < posicao; i++){
            nv[i] = n[i];
        }
        for (int i = posicao; i < n.length; i++){
            nv[i+1] = n[i];
        }
        return nv;
    }
    // MÉTODO PRINT
    public static void print (int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}





