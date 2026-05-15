package oo5;

import oo5.Conta;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Conta> objectMap = new HashMap<>();
        String i = "000";
        for (int s = 1; s != 0; ) {
            System.out.println("Informe a opção que deseja selecionar:" +
                    "\n0) Sair" +
                    "\n1) Criar conta corrente" +
                    "\n2) Transferir dinheiro" +
                    "\n3) Depositar dinheiro" +
                    "\n4) Sacar dinheiro");
            s = intSeletor();
            switch (s) {
                case 1: {
                    System.out.println("Insira três números: ");
                    i = numSeletor();
                    String obj = "conta" + i;
                    objectMap.put(obj, new Conta());
                    objectMap.get("conta" + i).setNumero(i);
                    System.out.println("Conta criada, o seu número é " + i);
                    break;
                }
                case 2: {
                    System.out.println("Insira o número da conta original:");
                    String ori = nextLine();
                    if (objectMap.containsKey("conta" + ori)) {
                        System.out.println("Insira o número da conta destino:");
                        String des = nextLine();
                        if (objectMap.containsKey("conta" + des)) {
                            System.out.println("Insira o valor a ser transferido:");
                            double desconto = nextDouble();
                            if (desconto > objectMap.get("conta" + ori).getSaldo()) {
                                System.out.println("Você não tem dinheiro o suficiente");
                                break;
                            } else {
                                objectMap.get("conta" + ori).setSaldo(objectMap.get("conta" + des).getSaldo() - desconto);
                                objectMap.get("conta" + des).setSaldo(objectMap.get("conta" + des).getSaldo() + desconto);
                                System.out.println("Transferido, a conta " + des + " agora tem R$" + objectMap.get("conta" + des).getSaldo());
                                break;
                            }
                        } else {
                            System.out.println("A conta não existe");
                            break;
                        }
                    } else {
                        System.out.println("A conta não existe");
                        break;
                    }
                }
                case 3: {
                    System.out.println("Insira o número da conta desejada");
                    String con = nextLine();
                    if (objectMap.containsKey("conta" + con)) {
                        System.out.println("Insira o valor a ser depositado:");
                        objectMap.get("conta" + con).setSaldo(objectMap.get("conta" + con).getSaldo() + nextDouble());
                        System.out.println("Depoistado, a conta " + con + " agora tem R$" + objectMap.get("conta" + con).getSaldo());
                        break;
                    } else {
                        System.out.println("A conta não existe");
                        break;
                    }
                }
                case 4: {
                    System.out.println("Insira o número da conta desejada");
                    String con = nextLine();
                    if (objectMap.containsKey("conta" + con)) {
                        System.out.println("Insira o valor a ser sacado:");
                        double valor = nextDouble();
                        if ((objectMap.get("conta" + con).getSaldo() - valor) < 0) {
                            System.out.println("Você não tem dinheiro o suficiente");
                        } else {
                            objectMap.get("conta" + con).setSaldo(objectMap.get("conta" + con).getSaldo() - valor);
                            System.out.println("Sacado, a conta " + con + " agora tem R$" + objectMap.get("conta" + con).getSaldo());
                            break;
                        }
                    } else {
                        System.out.println("A conta não existe");
                        break;
                    }
                }
            }
        }
    }


    public static int intSeletor() {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        while (i < 0 || i > 5) {
            System.out.println("Selecione um valor válido");
            i = in.nextInt();
        }
        return i;
    }

    public static String numSeletor() {
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        while (num.length() != 3) {
            System.out.println("Numero inválido, insira três números.");
            num = in.nextLine();
        }
        return num;
    }
    public static String nextLine() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    public static double nextDouble() {
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }
}


