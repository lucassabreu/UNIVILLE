package controlefinanceiro.control;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import controlefinanceiro.dao.DespesaReceita;
import controlefinanceiro.form.DlgDespesaReceitaDetail;
import controlefinanceiro.form.FrmDespesaReceita;

public class CrtDespesaReceita implements ActionListener {

	
	private FrmDespesaReceita frame;
	
	public CrtDespesaReceita(FrmDespesaReceita frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Component compClicado = 
				(Component)e.getSource();
		
		System.out.println(compClicado.getName());
		
		if(compClicado.getName().equals("btnIncluir")){
			//NOVO MODELO
			DespesaReceita novaDespRec = new DespesaReceita();
			new DlgDespesaReceitaDetail(novaDespRec);
			//aqui vai a logica para salvar no banco de dados
		}else{
			if(compClicado.getName().equals("btnAlterar")){
				DespesaReceita desprecSelec =
						frame.getRecDespSelectTable();
				new DlgDespesaReceitaDetail(desprecSelec);
				frame.atualizaTabela();
			}else{
				if(compClicado.getName().equals("btnExcluir")){
					DespesaReceita desprecSelec =
							frame.getRecDespSelectTable();
					
					int resposta =
					JOptionPane.
					showConfirmDialog(frame, 
							"Voce esta certo disso?","Excluir?",
							JOptionPane.YES_NO_OPTION);
					
					if(resposta == 0){
						System.out.println("Excluiu");
					}else{
						JOptionPane.showMessageDialog(frame, 
								"Exclusão Cancelada");
					}
				}
			}
		}
		
	}
}






