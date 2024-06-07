import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double A, B, adicao, multiplicacao, substracao, divisao;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        B = sc.nextDouble();

        adicao = A + B;
        multiplicacao = A * B;
        substracao = A - B;
        divisao = A / B;

        System.out.println("Adição: " + adicao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Substração: " + substracao);
        System.out.println("Divisão: " + divisao);
        
        sc.close();
    }
}