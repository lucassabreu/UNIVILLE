package controlefinanceiro.control;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controlefinanceiro.form.DlgDespesaReceitaDetail;

public class CrtDespesaReceitaDetail implements ActionListener{

	private DlgDespesaReceitaDetail frame;
	
	public CrtDespesaReceitaDetail(DlgDespesaReceitaDetail frame) {
		this.frame = frame;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		Component compClicado = (Component) e.getSource();
		if(compClicado.getName().equals("btbOK")){
			frame.atualizaModel();
			frame.dispose();
		}else{
			if(compClicado.getName().equals("btbCancelar")){
				frame.dispose();
			}
		}
	}
}
