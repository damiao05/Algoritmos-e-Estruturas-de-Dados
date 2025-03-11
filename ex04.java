import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        System.out.print("Digite outro valor: ");
        int valor2 = sc.nextInt();

        int soma = valor + valor2;

        System.out.println("A soma entre " + valor + " e " + valor2 + " é igual a " + soma);

        sc.close();
    }
}
