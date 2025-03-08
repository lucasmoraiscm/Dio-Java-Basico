package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche() {
        System.out.println("Escolhendo o lanche");
    }

    public void fazerPedido() {
        System.out.println("Fazendo o pedido");
    }

    public void pagarConta() {
        consultaSaldoAplicativo();
        System.out.println("Pagando a conta");
    }

    private void consultaSaldoAplicativo() {
        System.out.println("Cosultando saldo no aplicativo");
    }
}
