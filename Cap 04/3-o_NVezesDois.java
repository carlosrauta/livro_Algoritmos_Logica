import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        N = sc.nextInt();

        if (N * 2 > 30) {
            System.out.println("Resultado = " + N * 2);
        }
        sc.close();

    }
}