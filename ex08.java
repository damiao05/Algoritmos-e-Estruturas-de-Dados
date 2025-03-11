import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma distancia em metros: ");
        int distancia = sc.nextInt();

        int centimetros = distancia * 100;
        int kilometros = distancia / 100;
        int milimetros = distancia * 1000;

        System.out.println("Distância de " + centimetros + " Cm");
        System.out.println("Distância de " + kilometros + " Km");
        System.out.println("Distância de " + milimetros + " M   m");

        sc.close();
    }
}
