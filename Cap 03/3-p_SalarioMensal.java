import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double SM, PR, NS;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário mensal: ");
        SM = sc.nextDouble();
        System.out.print("Digite o percentual de reajuste: ");
        PR = sc.nextDouble();

        NS = SM + ((PR / 100) * SM);

        System.out.print("Novo salário: " + NS);

        sc.close();
    }
}