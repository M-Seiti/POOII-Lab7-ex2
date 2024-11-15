public abstract class Pedido {
    protected int quantidadeItens;
    protected double valorItem;

    public Pedido(int quantidadeItens, double valorItem) {
        this.quantidadeItens = quantidadeItens;
        this.valorItem = valorItem;
    }

    public final void processarPedido() {
        processarPagamento();
        decidirEntrega();
    }

    protected abstract void processarPagamento();
    protected abstract void decidirEntrega();
}
