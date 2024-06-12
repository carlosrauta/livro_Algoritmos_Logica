import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int A, B, C;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 números inteiros:");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if (A + B + C >= 100) {
            System.out.println("Resultado = " + (A + B + C));
        }

        sc.close();

    }
}