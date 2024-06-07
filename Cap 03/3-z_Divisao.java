import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double A, B, resultado;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        B = sc.nextDouble();

        resultado = (A / B) * (A / B);

        System.out.printf("Resultado: %.2f", resultado);

        sc.close();
    }
}