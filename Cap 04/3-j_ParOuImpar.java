import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }

        sc.close();

    }
}