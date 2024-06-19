import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int soma, numero, contador;
        double media;

        Scanner sc = new Scanner(System.in);

        contador = 0;
        soma = 0;
        while (contador < 10) {
            System.out.print("Digite um número inteiro: ");
            numero = sc.nextInt();
            soma += numero;
            contador++;
        }

        media = ((double) soma / 10);

        System.out.println("Soma = " + soma);
        System.out.printf("Média = %.2f", media);

        sc.close();
    }
}
