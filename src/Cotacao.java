public class Cotacao {
    public static void main(String[] args) {
        double valorEmDolares = 5.39;
        double cotacaoDolar = 4.94;
        double valorEmReais = valorEmDolares * cotacaoDolar;

        System.out.println(String.format("O valor de $ %.2f é, em reais, igual a R$ %.2f.", valorEmDolares, valorEmReais));
    }
}
