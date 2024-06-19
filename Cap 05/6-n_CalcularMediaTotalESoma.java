import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int total;
        double soma;
        double media;
        double numero;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        soma = 0.0;
        total = 0;

        while (true) {
            System.out.print("Digite um número: ");
            numero = sc.nextDouble();
            if (numero < 0) {
                break;
            }
            soma += numero;
            total += 1;
        }

        media = soma / total;

        System.out.printf("Soma = %.2f\n", soma);
        System.out.printf("Média = %.2f\n", media);
        System.out.println("Total de valores: " + total);

        sc.close();
    }
}
