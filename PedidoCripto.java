public class PedidoCripto extends Pedido {

    public PedidoCripto(int quantidadeItens, double valorItem) {
        super(quantidadeItens, valorItem);
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento via criptomoedas...");
        System.out.println("Total a pagar em criptomoedas: " + (quantidadeItens * valorItem) + " tokens.");
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Entrega será realizada após confirmação.");
    }
}
