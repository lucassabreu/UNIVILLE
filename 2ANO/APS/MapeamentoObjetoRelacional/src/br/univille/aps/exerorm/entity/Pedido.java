package br.univille.aps.exerorm.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int numero;

	@Temporal(TemporalType.DATE)
	@Column(name = "dat_emissao", nullable = false)
	private Date dataEmissao;

	@OneToMany(mappedBy = "pedido")
	private List<ItemPedido> itemPedidos;

	public Pedido() {
		this.dataEmissao = new Date();
	}

	public Pedido(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Pedido(int numero, Date dataEmissao) {
		this(dataEmissao);
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDataEmissao() {
		return this.dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public List<ItemPedido> getItemPedidos() {
		if (this.itemPedidos == null)
			this.itemPedidos = new ArrayList<>();

		return this.itemPedidos;
	}

	public void setItemPedidos(List<ItemPedido> itemPedidos) {
		this.itemPedidos = itemPedidos;
	}

	public ItemPedido addProduto(Produto produto, float valorUni, int quantidade) {
		return this.addItemPedido(new ItemPedido(this, produto, valorUni,
				quantidade));
	}

	public ItemPedido addItemPedido(ItemPedido itemPedido) {
		getItemPedidos().add(itemPedido);
		itemPedido.setPedido(this);

		return itemPedido;
	}

	public ItemPedido removeItemPedido(ItemPedido itemPedido) {
		getItemPedidos().remove(itemPedido);
		itemPedido.setPedido(null);

		return itemPedido;
	}

}