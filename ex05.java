import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        float nota = sc.nextFloat();

        System.out.print("Nota 2: ");
        float nota2 = sc.nextFloat();

        float media = (nota + nota2) / 2;
        System.out.print("A média entre " + nota + " e " + nota2 + " é igual a " + media);

        sc.close();
    }
}
