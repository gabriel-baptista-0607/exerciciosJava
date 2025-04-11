public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 10.00;
        double percentualDesconto = 30;
        double novoPreco = precoOriginal*(1-(percentualDesconto/100));

        System.out.println(String.format("O preco original do produto é de R$%.2f. Com um desconto de %.1f%%, o novo preço será de R$%.2f.", precoOriginal, percentualDesconto, novoPreco));
    }
}
