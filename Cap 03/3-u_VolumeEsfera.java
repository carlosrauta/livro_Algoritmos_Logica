import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final double PI = 3.14159;
        double volume, raio;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        raio = sc.nextDouble();

        volume = ( (double) 4 / 3) * PI * raio * raio * raio;

        System.out.printf("Volume da esfera: %.2f", volume);

        sc.close();
    }
}