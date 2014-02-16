package padaria;

import java.util.ArrayList;

public class Padaria {
	// escopo de classe
	private ArrayList<Atendente> colAtendentes 
	= new ArrayList<Atendente>();

	private ArrayList<Produto> colProdutos 
	= new ArrayList<Produto>();

	private ArrayList<Caixa> colCaixas 
	= new ArrayList<Caixa>();


	public ArrayList<Produto> getColProdutos(){
		return colProdutos;
	}

	public ArrayList<Atendente> getColAtendentes(){
		return colAtendentes;
	}

}







