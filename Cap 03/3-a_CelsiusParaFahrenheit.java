import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double C, F;
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        C = sc.nextDouble();

        F = (9 * C + 160) / 5;

        System.out.printf("Temperatura em Fahrenheit: %.1f", F);

        sc.close();
    }
}