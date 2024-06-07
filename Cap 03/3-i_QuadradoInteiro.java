import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int valor, resultado;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        valor = sc.nextInt();

        resultado = valor * valor;

        System.out.print("O quadrado do valor é " + resultado);

        sc.close();
    }
}