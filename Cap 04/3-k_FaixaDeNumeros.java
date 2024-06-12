import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha um numero inteiro que esteja na faixa de 1 até 9: ");
        numero = sc.nextInt();

        if ( numero > 0 && numero < 10) {
            System.out.println("O valor está na faixa permitida");
        } else {
            System.out.println("O valor está fora da faixa permitida");
        }
        
        sc.close();

    }
}