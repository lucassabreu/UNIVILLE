package br.univille.goldengift;

import java.util.ArrayList;
import java.util.Date;

public class PedidoCompra {
    private int                   numero;
    private Date                  data;
    private Representante         representante;
    private Cliente               cliente;
    private float                 valorTotal;
    private String                status;
    private ArrayList<ItemCompra> itens;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<ItemCompra> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemCompra> itens) {
        this.itens = itens;
    }

}
