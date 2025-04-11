public class Casting {
    public static void main(String[] args) {
        double valor = 5.839216487;
        System.out.println(String.format("O valor numérico original é de %f.", valor));
        int valorInteiro = (int) valor;
        System.out.println(String.format("O valor numérico inteiro da mesma variável é de %d.", valorInteiro));
    }
}
