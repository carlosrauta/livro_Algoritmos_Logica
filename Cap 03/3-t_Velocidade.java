import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double velocidade, distancia, tempo;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distancia (km): ");
        distancia = sc.nextDouble();
        System.out.print("Digite o tempo (min): ");
        tempo = sc.nextDouble();

        velocidade = (distancia * 1000) / (tempo * 60);

        System.out.printf("Velocidade (m/s): %.2f", velocidade);
        
        sc.close();
    }
}