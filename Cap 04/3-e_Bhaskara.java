import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double A, B, C, delta, x, x1, x2;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        B = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        C = sc.nextDouble();

        delta = B * B - 4 * A * C;

        if (delta < 0) {
            System.out.println("Não há solução real");
        } else if (delta == 0) {
            x = -B / (2 * A);
            System.out.pritln("Há duas soluções reais e iguais:")
            System.out.printf("x = %.2f\n", x);
        } else {
            System.out.println("Há duas soluções reais e diferentes:");
            x1 = (-B + Math.sqrt(delta)) / (2 * A);
            x2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("x1 = %.2f\n", x1);
            System.out.printf("x2 = %.2f\n", x2);
        }

        sc.close();
    }
}