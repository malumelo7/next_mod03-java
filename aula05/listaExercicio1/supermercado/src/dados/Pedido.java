package supermercado.src.dados;
import java.util.*;

public class Pedido {
    private List<Item> itens;
    private String formaDePagamento;

    public List<Item> getItens() {
        return this.itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public String getFormaDePagamento() {
        return this.formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
}
