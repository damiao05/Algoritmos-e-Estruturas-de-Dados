import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        double aumento = salario + (salario * 0.15);

        System.out.print("O seu novo sálario é de R$" + aumento);

        sc.close();
    }
}
