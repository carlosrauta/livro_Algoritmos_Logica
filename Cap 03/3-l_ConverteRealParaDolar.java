import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double cotacao, valorDolar, qtdReal;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        cotacao = sc.nextDouble();
        System.out.print("Digite a quantidade de reais (R$): ");
        qtdReal = sc.nextDouble();

        valorDolar = qtdReal / cotacao  ;

        System.out.printf("Valor em dólares: %.3f", valorDolar);

        sc.close();
    }
}