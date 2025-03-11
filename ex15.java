import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quatidade de dias trabalhados: ");
        int dias = sc.nextInt();

        double salario = (8 * 25) * dias;

        System.out.print("O sálario total é de R$" + salario);

        sc.close();
    }
}
