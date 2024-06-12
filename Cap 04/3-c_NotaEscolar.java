import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double N1, N2, N3, N4, MD;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota N1: ");
        N1 = sc.nextDouble();
        System.out.print("Digite a nota N2: ");
        N2 = sc.nextDouble();
        System.out.print("Digite a nota N3: ");
        N3 = sc.nextDouble();
        System.out.print("Digite a nota N4: ");
        N4 = sc.nextDouble();

        MD = (N1 + N2 + N3 + N4) / 4;

        if (MD >= 5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        System.out.printf("Valor da média = %.2f", MD);

        sc.close();
    }
}