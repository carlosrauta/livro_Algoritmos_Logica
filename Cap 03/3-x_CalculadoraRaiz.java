import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double base, indice, resultado;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base da raiz: ");
        base = sc.nextDouble();
        System.out.print("Digite o índice da raiz: ");
        indice = sc.nextDouble();

        resultado = Math.pow(base, 1 / indice);

        System.out.printf("Resultado: %.2f", resultado);

        sc.close();
    }
}