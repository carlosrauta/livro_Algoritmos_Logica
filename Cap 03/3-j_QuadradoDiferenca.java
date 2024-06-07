import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int A, B, resultado;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();

        resultado = (A - B) * (A - B);

        System.out.print("O resultado do quadrado da diferença é " + resultado);

        sc.close();
    }
}