public class Main {
    public static void main(String[] args) {

        int atual;
        int anterior;
        int proximo;

        anterior = 0;
        atual = 1;

        System.out.println("Os valores da sequência numérica de Fibonacci até o\n" +
                "décimo quinto termo são:");
        System.out.println(anterior);
        System.out.println(atual);

        for (int i = 3; i < 16; i++) {
            proximo = atual + anterior;
            System.out.println(proximo);
            anterior = atual;
            atual = proximo;
        }
    }
}
