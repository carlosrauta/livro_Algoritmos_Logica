import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        numero = sc.nextInt();

        if (!(numero > 3)) {
            System.out.println("Número: " + numero);
        }

        sc.close();

    }
}