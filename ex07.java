import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        float numero = sc.nextFloat();

        float dobro = numero * 2;
        float terca = numero / 3;

        System.out.println("O dobro de " + numero + " é " + dobro);
        System.out.println("A terça pare de " + numero + " é " + terca);

        sc.close();
    }
}
