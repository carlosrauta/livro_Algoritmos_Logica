import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final double PI = 3.14159;
        double volume, altura, R;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura: ");
        altura = sc.nextDouble();
        System.out.print("Digite o raio: ");
        R = sc.nextDouble();

        volume = PI * altura * R * R;

        System.out.printf("O valor do volume é %.2f", volume);

        sc.close();
    }
}