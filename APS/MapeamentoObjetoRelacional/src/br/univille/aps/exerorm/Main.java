package br.univille.aps.exerorm;

import java.util.ArrayList;

import org.hibernate.Session;

import br.univille.aps.exerorm.entity.ItemPedido;
import br.univille.aps.exerorm.entity.Pedido;
import br.univille.aps.exerorm.entity.Produto;
import br.univille.aps.exerorm.util.HibernateUtil;

public class Main {
	public static void main(String[] args) {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();

		s.beginTransaction();

		ArrayList<Produto> produtos = new ArrayList<>();

		produtos.add(new Produto("COCA-COLA"));
		produtos.add(new Produto("CHOCOLATE"));
		produtos.add(new Produto("ISOPROPIL"));

		for (Produto p : produtos)
			s.save(p);

		Pedido ped = new Pedido();

		ped.addProduto(produtos.get(0), 5.0f, 1);
		ped.addProduto(produtos.get(1), 1.0f, 5);
		ped.addProduto(produtos.get(2), 10.0f, 1);

		s.save(ped);

		for (ItemPedido ip : ped.getItemPedidos())
			s.save(ip);

		s.getTransaction().commit();
	}
}
