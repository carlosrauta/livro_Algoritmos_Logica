import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer a tabuada de qual número?");
        numero = sc.nextInt();

        for (int i = 1; i < 11; i++) {
             System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}