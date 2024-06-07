import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double C, F;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        F = sc.nextDouble();

        C = ((F - 32) * 5) / 9;

        System.out.printf("Temperatura em Celsius: %.1f", C);

        sc.close();
    }
}