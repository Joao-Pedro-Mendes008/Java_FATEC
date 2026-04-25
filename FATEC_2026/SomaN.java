import java.util.Scanner;

import javax.swing.JOptionPane;

public class SomaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de valores"));
        
        while(n <= 0){
            n = Integer.parseInt(JOptionPane.showInputDialog("Quantidade deve ser positiva"));
        }

        
    }
}