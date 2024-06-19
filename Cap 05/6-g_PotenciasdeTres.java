public class Main {
    public static void main(String[] args) {

        int resultados;

        resultados = 1;

        System.out.println("Todos os resultados das potências do valor de base 3, elevado a um\n"
                + "expoente que varie do valor O até o valor 15:");
        for (int i = 0; i < 16; i++) {
            System.out.println(resultados);
            resultados *= 3;
        }
    }
}
