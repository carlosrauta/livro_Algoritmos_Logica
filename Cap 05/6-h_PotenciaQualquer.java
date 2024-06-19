import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int base;
        int expoente;
        int resultado;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base da potência: ");
        base = sc.nextInt();
        System.out.print("Digite o expoente da potência: ");
        expoente = sc.nextInt();

        resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println("Resultado de " + base + " elevado a " + expoente
                + " é " + resultado);

        sc.close();
    }
}
