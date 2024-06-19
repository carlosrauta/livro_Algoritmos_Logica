import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero;
        int soma;
        int fatorial;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 15 números inteiros:");

        soma = 0;
        for (int i = 1; i < 16; i++) {
            numero = sc.nextInt();
            fatorial = calcularFatorial(numero);
            soma += fatorial;
        }

        System.out.println("Somatório = " + soma);

        sc.close();
    }

    public static int calcularFatorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
