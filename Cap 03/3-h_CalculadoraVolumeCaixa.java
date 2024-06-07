import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double volume, comprimento, largura, altura;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento: ");
        comprimento = sc.nextDouble();
        System.out.print("Digite a largura: ");
        largura = sc.nextDouble();
        System.out.print("Digite a altura: ");
        altura = sc.nextDouble();

        volume = comprimento * largura * altura;

        System.out.printf("Valor do volume: %.2f", volume);
        
        sc.close();
    }
}