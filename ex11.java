import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor A: ");
        double a = sc.nextDouble();

        System.out.print("Digite um valor B: ");
        double b = sc.nextDouble();

        System.out.print("Digite um valor C: ");
        double c = sc.nextDouble();

        double delta = (b*b) - 4 * a * c;
        System.out.print("O valor de Delta é: " + delta);

        sc.close();
    }
}
