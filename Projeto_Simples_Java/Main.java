import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import objetos.Copo;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Copo c = new Copo();
        System.out.println("Olá! Digite qual o estado do copo: ");
        String aswr = sc.nextLine();
        System.out.println(c.beber(aswr));
        sc.close();
    }
}