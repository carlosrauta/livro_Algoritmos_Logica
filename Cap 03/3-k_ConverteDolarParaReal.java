import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double cotacao, valorReal, qtdDolar;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        cotacao = sc.nextDouble();
        System.out.print("Digite a quantidade de dólares (US$): ");
        qtdDolar = sc.nextInt();

        valorReal = cotacao * qtdDolar;

        System.out.printf("Valor em reais: %.3f", valorReal);

        sc.close();
    }
}