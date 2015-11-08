package padaria;

import java.util.ArrayList;

public class Caixa {
	private Atendente meuAtendente;
	private ArrayList<Conta> colContas = new ArrayList<Conta>();
	
	public Caixa(Atendente meuAtendente) {
		this.meuAtendente = meuAtendente;
	}
	public Atendente getAtendente(){
		return meuAtendente;
	}
	
	
	
}
