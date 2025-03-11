import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de Km percorridos: ");
        double km = sc.nextDouble();

        System.out.print("Digite a quantidade de dias de uso: ");
        int dias = sc.nextInt();

        double precoTotal = (90 * dias) + (0.20 * km);

        System.out.print("O preço total a pagar é de: " + precoTotal);

        sc.close();
    }
}
