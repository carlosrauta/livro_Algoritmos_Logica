import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        String resposta;
        double largura;
        double comprimento;
        double areaComodo;
        double totalArea;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        totalArea = 0.0;
        do {
            System.out.println("Digite o nome do cômodo:");
            nome = sc.nextLine();
            System.out.println("Qual é o comprimento?");
            comprimento = sc.nextDouble();
            System.out.println("Qual é a largura?");
            largura = sc.nextDouble();
            areaComodo = largura * comprimento;
            System.out.printf("Área do cômodo " + nome + ": %.2f\n", areaComodo);
            totalArea += areaComodo;
            System.out.println("Deseja continuar?");
            sc.nextLine();
            resposta = sc.nextLine();
        } while (!resposta.equals("NÃO"));

        System.out.printf("Área total da residencia: %.2f\n", totalArea);

        sc.close();
    }
}
