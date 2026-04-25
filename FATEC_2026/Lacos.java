import java.util.Scanner;

public class Lacos{
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        while (!s.equalsIgnoreCase("pare")){
            System.out.print("Quando quiser parar digite \"pare\"\n");
            s = sc.nextLine();
        }
        sc.close();
    }
}