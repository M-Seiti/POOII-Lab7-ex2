public class PedidoOnline extends Pedido {

    public PedidoOnline(int quantidadeItens, double valorItem) {
        super(quantidadeItens, valorItem);
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento online...");
        System.out.println("Total a pagar: R$ " + (quantidadeItens * valorItem));
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Entrega será realizada no endereço do cliente.");
    }
}
