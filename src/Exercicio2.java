public class Exercicio2 {
    public static void main(String[] args) {

        int dias = 0;
        double total = 10;

        while (total > 0.001){
            double kmRestante = total/2;
            total -= kmRestante;
            dias++;
        }
        System.out.println("A quantidade de dias sem zerar é: " + dias);
    }
}
