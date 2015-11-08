package controlefinanceiro.form;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import controlefinanceiro.dao.DespesaReceita;
import controlefinanceiro.dao.TipoDespesaReceita;

public class TabelaModel extends AbstractTableModel{

	private String titulos[] = {"Código", "Descrição", "Tipo"};
	
	private ArrayList<DespesaReceita> colDesRec = 
			new ArrayList<DespesaReceita>();
	
	
	public DespesaReceita getDespRecSelec(int posicao){
		return colDesRec.get(posicao);	
	}
	
	
	public TabelaModel() {
		colDesRec.add(new 
				DespesaReceita(1, "Contas", 
						TipoDespesaReceita.DESPESA));
		
		colDesRec.add(new 
				DespesaReceita(2, "Salario", 
						TipoDespesaReceita.RECEITA));

		colDesRec.add(new 
				DespesaReceita(3, "Mensalidade UNIVILLE", 
						TipoDespesaReceita.DESPESA));
	}
	
	
	@Override
	public String getColumnName(int column) {
		return titulos[column];
	}

	@Override
	public int getRowCount() {
		return colDesRec.size();
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public Object getValueAt(int linha, int col) {
		DespesaReceita umaDespesaReceita = 
				colDesRec.get(linha);
		switch (col) {
			case 0:
				return umaDespesaReceita.getCodigo();
			case 1:
				return umaDespesaReceita.getDescricao();
			case 2:
				return umaDespesaReceita.getTipo();

		}
		return null;
	}


	public void atualizaTabela() {
		fireTableDataChanged();
	}

		
}
