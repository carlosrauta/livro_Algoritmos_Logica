public class Main {
    public static void main(String[] args) {

        int soma;

        soma = 0;
        for (int i = 1; i < 101; i++) {
            soma += i;
        }

        System.out.println("A soma é " + soma);
    }
}