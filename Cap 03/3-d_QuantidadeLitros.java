import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int kmPorLitro = 12;
        double tempo, velocidade, distancia, litrosUsados;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a velocidade média (km/hora): ");
        velocidade = sc.nextDouble();
        System.out.print("Digite o tempo de viagem (em horas): ");
        tempo = sc.nextDouble();

        distancia = velocidade * tempo;
        litrosUsados = distancia / kmPorLitro;

        System.out.printf("Velocidade média (km/hora): %.2f\n", velocidade);
        System.out.printf("Tempo de viagem (horas): %.2f\n", tempo);
        System.out.printf("Distância percorrida (km): %.2f\n", distancia);
        System.out.printf("Quantidade de litros utilizada: %.2f", litrosUsados);

        sc.close();
    }
}