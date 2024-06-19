public class Main {
    public static void main(String[] args) {

        double soma;
        double media;

        soma = 0.0;
        for (int i = 50; i < 71; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        media = soma / 20;

        System.out.println("Soma = " + soma);
        System.out.printf("Media = %.2f", media);
    }
}
