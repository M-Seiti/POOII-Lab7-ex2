/*
A diferença entre o padrão Template Method e o Decorator é que o Template Method define o esqueleto de um algoritmo na classe base, permitindo que subclasses específicas implementem partes do algoritmo sem alterar sua estrutura geral. Já o Decorator permite adicionar responsabilidades adicionais a um objeto dinamicamente, fornecendo uma alternativa flexível à herança para estender funcionalidades.
*/

public class Main {
    public static void main(String[] args) {
        Pedido pedidoOnline = new PedidoOnline(5, 10.0);
        pedidoOnline.processarPedido();

        System.out.println();

        Pedido pedidoNaLoja = new PedidoNaLoja(3, 15.0);
        pedidoNaLoja.processarPedido();

        System.out.println();

        Pedido pedidoCripto = new PedidoCripto(2, 20.0);
        pedidoCripto.processarPedido();
    }
}
