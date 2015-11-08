package controlefinanceiro.form;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controlefinanceiro.control.CrtDespesaReceita;
import controlefinanceiro.dao.DespesaReceita;

public class FrmDespesaReceita extends JFrame {
	
	private JScrollPane jpnCentro;
	private JPanel jpnSul;
	private JTable tabela;
	private TabelaModel model;
	private JButton btnIncluir, btnAlterar, btnExcluir;
	private CrtDespesaReceita control;
	
	
	public DespesaReceita getRecDespSelectTable(){
		return model.getDespRecSelec(getLinhaSelect());
	}
	
	public int getLinhaSelect(){
		return tabela.getSelectedRow();
	}
	public void atualizaTabela(){
		model.atualizaTabela();
	}
	
	
	public FrmDespesaReceita() {
		
		control = new CrtDespesaReceita(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		criaJpnCentro(); // NAO ESQUEÇA DE CHAMAR AQUI...
		criaJpnSul(); //NAO ESQUEÇA DE CHAMARA AQUI OHHH \o/\o/\o/
		setVisible(true);
	}
	
	private void criaJpnCentro(){
		model = new TabelaModel();
		
		tabela = new JTable(model);
		
		jpnCentro = new JScrollPane(tabela);
		add(jpnCentro,BorderLayout.CENTER);
	}
	private void criaJpnSul(){
		jpnSul = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		add(jpnSul,BorderLayout.SOUTH);
		
		btnIncluir = new JButton("Incluir");
		btnIncluir.setName("btnIncluir");
		btnIncluir.addActionListener(control);
		
		jpnSul.add(btnIncluir);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.setName("btnAlterar");
		btnAlterar.addActionListener(control);
		jpnSul.add(btnAlterar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setName("btnExcluir");
		btnExcluir.addActionListener(control);
		jpnSul.add(btnExcluir);
		
	}
	
	public static void main(String[] args) {
		new FrmDespesaReceita();
	}
}
