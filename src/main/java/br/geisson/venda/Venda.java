package br.geisson.venda;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Double total = 0D;

    private Double porcentualTaxa;

    private Double porcentualLucro;

    private List<VendaItem> items = new ArrayList<>();

    public Venda(Double taxa, Double porcentualLucro) {
        this.porcentualTaxa = taxa;
        this.porcentualLucro = porcentualLucro;
    }

    public void addItem(String produto, Double valor) {
        items.add(new VendaItem(produto, valor));
        this.total = this.total + valor;
    }

    public Double getValorBruto() {
        return total - total * (porcentualTaxa + porcentualLucro);
    }

    public Double getLucro() {
        return total * porcentualLucro;
    }

    public Double getTaxa() {
        return this.total * porcentualTaxa;
    }
}
