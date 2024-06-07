import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double A, B, aux;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        B = sc.nextDouble();

        aux = B;
        B = A;
        A = aux;

        System.out.println("Troca de valores:");
        System.out.println("A = " + A);
        System.out.print("B = " + B);

        sc.close();
    }
}