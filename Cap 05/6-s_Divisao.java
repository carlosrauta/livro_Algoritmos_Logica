import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int divisor;
        int quociente;
        int dividendo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        dividendo = sc.nextInt();
        System.out.print("Digite o divisor: ");
        divisor = sc.nextInt();

        quociente = 0;

        if (divisor == 0) {
            System.out.println("Não é possível dividir por zero");
        } else if (dividendo < divisor) {
            System.out.println("Não é possível efetuar a divisão inteira.");
        } else {
            while (dividendo >= divisor) {
                dividendo -= divisor;
                quociente++;
            }
            System.out.println("O quociente cabe " + quociente + " vezes no dividendo");
        }

        sc.close();
    }
}
