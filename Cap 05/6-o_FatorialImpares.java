import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long fatorial;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) {
                fatorial = calcularFatorial(i);
                System.out.println("Fatorial de " + i + " é " + fatorial);
            }
        }

        sc.close();
    }

    public static long calcularFatorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
