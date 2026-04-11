import java.util.Scanner;
import java.util.ArrayList;

public class Condicionais {
    public static void main(String[] args) {
        ArrayList<ArrayList<int>> matriz = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Olá, digite o que deseja visualizar: ");
            System.out.println("Matriz\nPares\nSair");
            String resposta = sc.nextLine();
            switch (resposta.toLowerCase()) {
                case "matriz":
                    for (int[] linha : matriz) {
                        for (int valor : linha) {
                            System.out.printf("%4d", valor);
                        }
                        System.out.println();
                    }
                    break;
                case "pares":
                    for (int[] linha : matriz) {
                        for (int valor : linha) {
                            if ((valor % 2) == 0) {
                                pares.add(valor);
                            }
                        }
                    }
                    System.out.println(pares);
                    break;
            }
            if (resposta.equalsIgnoreCase(resposta)){
                break;
            }
        }
        sc.close();
    }
}