import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int A, B;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();

        if (A > B) {
            System.out.println("Resultado = " + (A - B));
        } else {
            System.out.println("Resultado = " + (B - A));
        }

        sc.close();

    }
}