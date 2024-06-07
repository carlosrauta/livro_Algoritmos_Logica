import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int A, sucessor, antecessor;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();

        sucessor = A + 1;
        antecessor = A - 1;

        System.out.println("Sucessor: " + sucessor);
        System.out.print("Antecessor: " + antecessor);

        sc.close();
    }
}