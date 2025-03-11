import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Altura da parede: ");
        Double altura = sc.nextDouble();
        System.out.print("Largura da parede: ");
        Double largura = sc.nextDouble();

        Double area = altura * largura;

        Double quantidade = area / 2;

        System.out.println("Em uma parede de altura " + altura + " e largura " + largura + ", a área total é de " + area + ", sendo necessário uma quantidade de tinta igual a: " + quantidade);

        sc.close();
    }
}
