import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero;
        int maior;
        int menor;

        Scanner sc = new Scanner(System.in);

        maior = 1;
        menor = 1;

        while (true) {
            System.out.print("Digite um número inteiro: ");
            numero = sc.nextInt();
            if (numero < 0) {
                break;
            }
            if (numero > maior) {
                maior = numero;
            } else {
                menor = numero;
            }
        }

        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);

        sc.close();
    }
}
