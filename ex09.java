import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos reais você tem na carteira? ");
        float n = sc.nextFloat();

        double dolar = n / 3.45;

        System.out.println("Com R$" + n + ", você pode comprar U$" + dolar);

        sc.close();
    }
}
