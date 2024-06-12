import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double N1, N2, N3, N4, NE, MD1, MD2;

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

        MD1 = (N1 + N2 + N3 + N4) / 4;

        if (MD1 >= 7) {
            System.out.println("Aprovado");
            System.out.printf("Valor da média = %.2f\n", MD1);
        } else {
            System.out.print("Digite a nota NE: ");
            NE = sc.nextDouble();

            MD2 = (MD1 + NE) / 2;

            if (MD2 >= 5) {
                System.out.println("Aprovado em exame");
                System.out.printf("Valor da média = %.2f\n", MD2);
            } else {
                System.out.println("Reprovado");
                System.out.printf("Valor da média = %.2f\n", MD2);
            }
        }

        sc.close();
    }
}