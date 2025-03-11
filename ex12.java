import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        double promocao = preco - (preco * 0.05);

        System.out.print("O preço promocional do produto é: " + promocao);

        sc.close();
    }
}
