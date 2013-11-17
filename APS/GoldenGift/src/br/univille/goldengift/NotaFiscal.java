package br.univille.goldengift;

import java.util.ArrayList;
import java.util.Date;

public class NotaFiscal {
    private int                       numero;
    private Date                      data;
    private Representante             representante;
    private Cliente                   cliente;
    private float                     valorTotal;
    private String                    status;
    private PedidoCompra              pedidoCompra;
    private ArrayList<ItemNotaFiscal> itens;
    private Transportadora            transportadora;

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public PedidoCompra getPedidoCompra() {
        return pedidoCompra;
    }

    public void setPedidoCompra(PedidoCompra pedidoCompra) {
        this.pedidoCompra = pedidoCompra;
    }

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

    public ArrayList<ItemNotaFiscal> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemNotaFiscal> itens) {
        this.itens = itens;
    }

}
