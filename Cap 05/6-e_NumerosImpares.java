public class Main {
    public static void main(String[] args) {

        System.out.println("Todos os números ímpares de 1 a 20:");
        for (int i = 1; i < 21; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}