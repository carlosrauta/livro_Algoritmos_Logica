import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int A, B, C, aux;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores de A, B e C:");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if (A > B) {
            aux = B;
            B = A;
            A = aux;
        }

        if (A > C) {
            aux = C;
            C = A;
            A = aux;
        }

        if (B > C) {
            aux = C;
            C = B;
            B = aux;
        }

        System.out.println("Ordem crescente: " + A + ", " + B + ", " + C);

        sc.close();
    }
}