import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int A, B, C, D, soma, multiplicacao;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        C = sc.nextInt();
        System.out.print("Digite o valor de D: ");
        D = sc.nextInt();

        soma = (A + B) + (A + C) + (A + D) + (B + C) + (B+ D) + (C + D);
        multiplicacao = (A * B) + (A * C) + (A * D) + (B * C) + (B * D) + (C * D);

        System.out.println("Resultado das adições: " + soma);
        System.out.print("Resultado das multiplicações: " + multiplicacao);

        sc.close();
    }
}