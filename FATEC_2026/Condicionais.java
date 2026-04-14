import java.util.Scanner;
import java.util.ArrayList;

public class Condicionais {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayTemp = new ArrayList<>();
        while (true) {
            System.out.println("Olá, digite o que deseja fazer: ");
            System.out.println("Matriz\nPares\nSair\nAdicionar Coluna e Valores");
            String resposta = sc.nextLine();

            switch (resposta.toLowerCase()) {
                case "matriz":
                    for (ArrayList<Integer> linha : matriz) {
                        for (int valor : linha) {
                            System.out.printf("|%4d    ", valor);
                        }
                        System.out.println();
                    }
                    break;
                case "pares":
                    pares.clear();
                    for (ArrayList<Integer> linha : matriz) {
                        for (int valor : linha) {
                            if ((valor % 2) == 0) {
                                pares.add(valor);
                            }
                        }
                    }
                    System.out.println(pares);
                    break;
                case "adicionar coluna e valores":
                    arrayTemp.clear();
                    System.out.println("Coluna adicionada, digite seus valores: \nDigite enter para sair");
                    while (true) {
                        String aswr = sc.nextLine();
                        if (aswr.equalsIgnoreCase("sair")) {
                            break;
                        }
                        try {
                            int convAswr = Integer.parseInt(aswr);
                            arrayTemp.add(convAswr);
                        } catch (NumberFormatException e) {
                            System.out.println("Valor não reconhecido, tente novamente.");
                        }
                    }
                    matriz.add(new ArrayList<>(arrayTemp));
                    break;
            }
            if (resposta.equalsIgnoreCase("sair")) {
                break;
            }
        }
        sc.close();
    }
}