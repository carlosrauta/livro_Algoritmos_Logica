import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pes, metro;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em pés: ");
        pes = sc.nextDouble();

        metro = pes * 0.3048;

        System.out.printf("Medida em metros: %.2f", metro);

        sc.close();
    }
}