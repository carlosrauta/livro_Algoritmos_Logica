import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double prestacao, valor, taxa, tempo;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da parcela: ");
        valor = sc.nextDouble();
        System.out.print("Digite o valor da taxa (a.m): ");
        taxa = sc.nextDouble();
        System.out.print("Digite o tempo de atraso (mes): ");
        tempo = sc.nextDouble();

        prestacao = valor + (valor * (taxa / 100) * tempo);

        System.out.printf("Valor da parcela atrasada: %.2f", prestacao);

        sc.close();
    }
}