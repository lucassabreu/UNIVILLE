package padaria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sistema {
	public static void main(String[] args) {
		Padaria padoca = new Padaria();
		
		Produto p1 = new Produto();
		p1.setCodigo(001);
		p1.setDescricao("Pãozinho");
		p1.setValor(0.25f);
		
		Produto p2 = new Produto();
		p2.setCodigo(002);
		p2.setDescricao("Leite");
		p2.setValor(1.5f);
		
		padoca.getColProdutos().add(p1);
		padoca.getColProdutos().add(p2);
		
		int tamanhoMax = padoca.getColProdutos().size();
		
		for(int i=0;i<tamanhoMax;i++){
			System.out.println("#"+i);
			
			Produto umProd = padoca.getColProdutos().get(i);
			System.out.println(umProd.getDescricao());
			System.out.println(umProd.getValor());
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//"MM/dd/yyyy"
		
		Atendente at1 = new Atendente();
		at1.setCodigo(123);
		at1.setNome("Zezinho");
		at1.setTelefone("5555-1234");
		try {
			at1.setDataNascimento(sdf.parse("10/04/2004"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Atendente at2 = new Atendente();
		at2.setCodigo(321);
		at2.setNome("Pedrinho");
		at2.setTelefone("5555-4321");
		try {
			at2.setDataNascimento(sdf.parse("05/05/2000"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		padoca.getColAtendentes().add(at1);
		padoca.getColAtendentes().add(at2);
		
		for(Atendente umAtend : padoca.getColAtendentes()){
			
			System.out.println(umAtend.getNome());
			System.out.println(umAtend.getTelefone());
			System.out.println(umAtend.getCodigo());
			System.out.println(
					
					sdf.format(umAtend.getDataNascimento()));
		}
		
		
		
		Caixa c1 = new Caixa(at1);
		
		Conta conta1 = new Conta();
		
		ItemConta it1 = new ItemConta();
		it1.setProduto(p1);
		it1.setQuantidade(4);
		conta1.getColItensConta().add(it1);
		
		ItemConta it2 = new ItemConta();
		it2.setProduto(p2);
		it2.setQuantidade(2);
		conta1.getColItensConta().add(it2);
		
		
		
		
		
	}
}








