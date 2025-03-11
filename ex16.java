import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos cigarros você fuma por dia? ");
        int n = sc.nextInt();

        System.out.print("Quantos anos você fuma? ");
        int anos = sc.nextInt();

        double dias = (anos * 365) * (n * 0.0069);

        System.out.print("Você perdeu " + dias + " ano(s) de vida.");

        sc.close();
    }
}
