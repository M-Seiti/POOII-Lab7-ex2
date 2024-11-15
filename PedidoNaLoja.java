public class PedidoNaLoja extends Pedido {

    public PedidoNaLoja(int quantidadeItens, double valorItem) {
        super(quantidadeItens, valorItem);
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento na loja...");
        System.out.println("Total a pagar: R$ " + (quantidadeItens * valorItem));
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Cliente retirará os itens na loja.");
    }
}
