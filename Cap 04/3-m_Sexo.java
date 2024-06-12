import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        char sexo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        nome = sc.nextLine();
        System.out.print("Digite o sexo: ");
        sexo = sc.next().charAt(0);

        if (sexo == 'M' || sexo == 'F') {
            if (sexo == 'M') {
                System.out.println("llmo. Sr. " + nome);
            } else {
                System.out.println("llma. Sra. " + nome);
            }
        } else {
            System.out.println("Sexo informado inválido");
        }

        sc.close();

    }
}