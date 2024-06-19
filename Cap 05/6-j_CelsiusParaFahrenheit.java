public class Main {
    public static void main(String[] args) {

        double celsius;
        double fahrenheit;

        System.out.println("Valores de conversão de graus Celsius em graus\n" +
                "Fahrenheit, de dez em dez graus, até 100 graus:");
        for (int i = 10; i < 101; i += 10) {
            celsius = i;
            fahrenheit = (9 * celsius + 160) / 5;
            System.out.printf("Graus em Celsius: " + celsius
                    + "; Graus em Fahrenheit: %.2f\n", fahrenheit);
        }
    }
}
