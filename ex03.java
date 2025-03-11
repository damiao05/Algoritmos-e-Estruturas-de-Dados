import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do Funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Salário: ");
        float salario = sc.nextFloat();

        System.out.println("O funcionário " + nome + " tem um salário de R$" + salario + " em junho.");

        sc.close();
    }
}
