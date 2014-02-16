package controlefinanceiro.form;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controlefinanceiro.control.CrtDespesaReceitaDetail;
import controlefinanceiro.dao.DespesaReceita;
import controlefinanceiro.dao.TipoDespesaReceita;

import ui.util.layouts.ParagraphLayout;

public class DlgDespesaReceitaDetail extends JDialog{
	private JPanel jpnCentro, jpnSul;
	private JTextField txtCodigo;
	private JTextArea txtDescricao;
	private JComboBox jcbTipo;
	private JButton btbOK, btbCancelar;
	private CrtDespesaReceitaDetail control;
	private DespesaReceita model;
	
	
	public DlgDespesaReceitaDetail(DespesaReceita despRec) {
		control = new CrtDespesaReceitaDetail(this);
		model = despRec;
		
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(400,400);
		setTitle("Detalhe da Despesa/Receita");
		setModal(true);
		criaPainelCentro(); //NAO ESQUECER DE CHAMAR ESTE METODO AQUI
		criaPainelSul(); // \o/\o/\o/ NAO ESQUEÇA DA MINHA CALOI...
		
		atualizaCampos();
		
		setVisible(true);
	}
	
	private void atualizaCampos(){
		txtCodigo.setText(String.valueOf(model.getCodigo()));
		txtDescricao.setText(model.getDescricao());
		if(model.getTipo() == TipoDespesaReceita.DESPESA)
			jcbTipo.setSelectedIndex(0);
		else
			jcbTipo.setSelectedIndex(1);
	}
	public void atualizaModel(){
		model.setCodigo(Integer.parseInt(txtCodigo.getText()));
		model.setDescricao(txtDescricao.getText());
		if(jcbTipo.getSelectedIndex() == 0)
			model.setTipo(TipoDespesaReceita.DESPESA);
		else
			model.setTipo(TipoDespesaReceita.RECEITA);
	}
	
	
	
	public void criaPainelSul(){
		jpnSul = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		add(jpnSul,BorderLayout.SOUTH);
		
		btbOK = new JButton("OK");
		btbOK.setName("btbOK");
		btbOK.addActionListener(control);
		jpnSul.add(btbOK);
		
		btbCancelar = new JButton("Cancelar");
		btbCancelar.setName("btbCancelar");
		btbCancelar.addActionListener(control);
		jpnSul.add(btbCancelar);
		
	}
	public void criaPainelCentro(){
		jpnCentro = new JPanel(new ParagraphLayout());
		add(jpnCentro,BorderLayout.CENTER);
		
		jpnCentro.add(new JLabel("Código"),ParagraphLayout.NEW_PARAGRAPH);
		txtCodigo = new JTextField(20);
		jpnCentro.add(txtCodigo);
		
		jpnCentro.add(new JLabel("Descrição"),ParagraphLayout.NEW_PARAGRAPH);
		txtDescricao = new JTextArea(5,25);
		txtDescricao.setLineWrap(true);
		jpnCentro.add(new JScrollPane(txtDescricao));
		
		jpnCentro.add(new JLabel("Tipo"),ParagraphLayout.NEW_PARAGRAPH);
		jcbTipo = new JComboBox();
		jcbTipo.addItem("Despesa");
		jcbTipo.addItem("Receita");
		jcbTipo.setSelectedIndex(-1);
		jpnCentro.add(jcbTipo);
		
	}
	
	
}
