import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int A, B, C, soma;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        C = sc.nextInt();

        soma = (A + B + C) * (A + B + C);

        System.out.print("O quadrado da soma é " + soma);

        sc.close();
    }
}