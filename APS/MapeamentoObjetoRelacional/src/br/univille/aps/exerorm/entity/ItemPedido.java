package br.univille.aps.exerorm.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "item_pedido")
public class ItemPedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne(optional = false)
	@JoinColumn(name = "num_pedido", nullable = false, insertable = false, updatable = false)
	@ForeignKey(name = "fk_item_pedido_pedido")
	private Pedido pedido;

	@Id
	@ManyToOne(optional = false)
	@JoinColumn(name = "num_produto", nullable = false, insertable = false, updatable = false)
	@ForeignKey(name = "fk_item_pedido_produto")
	private Produto produto;

	@Column(name = "qt_produto", nullable = false)
	private int quantidade;

	@Column(name = "valor_uni_produto", nullable = false, precision = 10, scale = 2)
	private float valorUnitario;

	public ItemPedido() {
	}

	public ItemPedido(Pedido pedido, Produto produto) {
		this();
		this.pedido = pedido;
		this.produto = produto;
	}

	public ItemPedido(Pedido pedido, Produto produto, float valorUni, int quant) {
		this(pedido, produto);
		this.valorUnitario = valorUni;
		this.quantidade = quant;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getValorUnitario() {
		return this.valorUnitario;
	}

	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}