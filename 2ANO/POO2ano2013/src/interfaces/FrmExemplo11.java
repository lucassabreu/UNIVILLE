package interfaces;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

import ui.util.layouts.ParagraphLayout;

public class FrmExemplo11 extends JFrame implements ActionListener{
	
	private JPanel jpnCentro;
	private JCheckBox jcbVerde, jcbAmarelo, jcbVermelho;
	private JRadioButton jrbVerde, jrbAmarelo, jrbVermelho;
	
	public FrmExemplo11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		criaPainel(); // precisa chamar aqui...!!!!
		setVisible(true);
	}
	
	public void criaPainel(){
		jpnCentro = new JPanel(new ParagraphLayout());
		add(jpnCentro,BorderLayout.CENTER);
		
		jcbVerde = new JCheckBox("Verde");
		jcbVerde.setName("jcbVerde");
		jcbVerde.addActionListener(this);
		
		jcbAmarelo = new JCheckBox("Amarelo");
		jcbAmarelo.setName("jcbAmarelo");
		jcbAmarelo.addActionListener(this);
		
		jcbVermelho = new JCheckBox("Vermelho");
		jcbVermelho.setName("jcbVermelho");
		jcbVermelho.addActionListener(this);
		
		
		jpnCentro.add(jcbVerde);
		jpnCentro.add(jcbAmarelo);
		jpnCentro.add(jcbVermelho);
		jcbVermelho.setToolTipText("Ola Gyan");
		
		jrbVerde = new JRadioButton("Verde");
		jrbVerde.setName("jrbVerde");
		jrbVerde.addActionListener(this);
		
		jrbAmarelo = new JRadioButton("Amarelo");
		jrbAmarelo.setName("jrbAmarelo");
		jrbAmarelo.addActionListener(this);
		
		jrbVermelho = new JRadioButton("Vermelho");
		jrbVermelho.setName("jrbVermelho");
		jrbVermelho.addActionListener(this);
		
		jpnCentro.add(jrbVerde,ParagraphLayout.NEW_PARAGRAPH);
		jpnCentro.add(jrbAmarelo);
		jpnCentro.add(jrbVermelho);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbAmarelo);
		bg.add(jrbVermelho);
		bg.add(jrbVerde);
	}
	public static void main(String[] args) {
		new FrmExemplo11();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JToggleButton checkClicado = (JToggleButton)e.getSource();
		System.out.println("Nome:" + checkClicado.getName());
		System.out.println("Marcado: " + checkClicado.isSelected());
		
	}

}





