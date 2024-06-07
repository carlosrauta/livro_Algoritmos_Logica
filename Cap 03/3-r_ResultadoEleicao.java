import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String A, B, C;
        int votoNulo, votoBranco, votoA, votoB, votoC, totalEleitores;
        double percentualVotoValido, percentualVotoA, percentualVotoB,
                percentualVotoC, percentualVotoNulo, percentualVotoBranco;


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do candidato A: ");
        A = sc.nextLine();
        System.out.print("Digite o nome do candidato B: ");
        B = sc.nextLine();
        System.out.print("Digite o nome do candidato C: ");
        C = sc.nextLine();

        System.out.print("Quantidade de votos válidos para " + A + ": ");
        votoA = sc.nextInt();
        System.out.print("Quantidade de votos válidos para " + B + ": ");
        votoB = sc.nextInt();
        System.out.print("Quantidade de votos válidos para " + C + ": ");
        votoC = sc.nextInt();
        System.out.print("Quantidade de votos nulos: ");
        votoNulo = sc.nextInt();
        System.out.print("Quantidade de votos brancos: ");
        votoBranco = sc.nextInt();

        totalEleitores = votoA + votoB + votoC + votoNulo + votoBranco;
        percentualVotoValido = (( (double) votoA + votoB + votoC) / totalEleitores) * 100;
        percentualVotoA =  ( (double) votoA / totalEleitores) * 100;
        percentualVotoB = ( (double) votoB / totalEleitores) * 100;
        percentualVotoC = ( (double) votoC / totalEleitores) * 100;
        percentualVotoNulo = ( (double) votoNulo / totalEleitores) * 100;
        percentualVotoBranco = ( (double) votoBranco / totalEleitores) * 100;

        System.out.println("Total de eleitores: " + totalEleitores);
        System.out.printf("Percentual de votos válidos: %.1f\n", percentualVotoValido);
        System.out.printf("Percentual do candidato " + A + ": %.1f\n", percentualVotoA);
        System.out.printf("Percentual do candidato " + B + ": %.1f\n", percentualVotoB);
        System.out.printf("Percentual do candidato " + C + ": %.1f\n", percentualVotoC);
        System.out.printf("Percentual dos votos nulos: %.1f\n", percentualVotoNulo);
        System.out.printf("Percentual dos votos brancos: %.1f", percentualVotoBranco);

        sc.close();
    }
}