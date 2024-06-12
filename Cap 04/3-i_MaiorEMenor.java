import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int A, B, C, D, E, maior, menor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        A = sc.nextInt();
        System.out.println("Digite o valor de B:");
        B = sc.nextInt();
        System.out.println("Digite o valor de C:");
        C = sc.nextInt();
        System.out.println("Digite o valor de D:");
        D = sc.nextInt();
        System.out.println("Digite o valor de E:");
        E = sc.nextInt();

        maior = A;
        if (B > maior) {
            maior = B;

        }
        if (C > maior) {
            maior = C;
        }
        if (D > maior) {
            maior = D;
        }
        if (E > maior) {
            maior = E;
        }

        menor = A;
        if (B < menor) {
            menor = B;
        }
        if (C < menor) {
            menor = C;
        }
        if (D < menor) {
            menor = D;
        }
        if (E < menor) {
            menor = E;
        }

        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);

        sc.close();
    }
}