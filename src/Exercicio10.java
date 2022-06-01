public class Exercicio10 {
    public static void main(final String[] args) {
        final int VALOR = 6;

        for(int i = 0; i < VALOR; i++){
            System.out.println(x(i));
        }
    }

    public static int x (final int n){
        int result = 1;

        for (int i = 2; i <= n ; i++) {
            result *= i;
        }
        return result;
    }

}
