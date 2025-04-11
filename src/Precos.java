public class Precos {
    public static void main(String[] args) {
        double precoProduto = 5.00;
        int qtd = 10;
        double valorTotal = precoProduto* (double) qtd;
        System.out.println(String.format("O valor total da compra de %d sucos que custam R$%.2f cada vale R$ %.2f.", qtd, precoProduto, valorTotal));
    }
}
