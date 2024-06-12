import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int A, B, C, D;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        A = sc.nextInt();
        System.out.println("Digite o valor de B:");
        B = sc.nextInt();
        System.out.println("Digite o valor de C:");
        C = sc.nextInt();
        System.out.println("Digite o valor de D:");
        D = sc.nextInt();

        System.out.println("Valores divisíveis por 2 e 3:");

        if (A % 2 == 0 && A % 3 == 0) {
            System.out.println(A);
        }
        if (B % 2 == 0 && B % 3 == 0) {
            System.out.println(B);
        }
        if (C % 2 == 0 && C % 3 == 0) {
            System.out.println(C);
        }
        if (D % 2 == 0 && D % 3 == 0) {
            System.out.println(D);
        }

        sc.close();
    }
}