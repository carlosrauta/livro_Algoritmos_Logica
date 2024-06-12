import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        N = sc.nextInt();

        if (N < 0) {
            N *= -1;;
        }

        System.out.println(N);

        sc.close();

    }
}