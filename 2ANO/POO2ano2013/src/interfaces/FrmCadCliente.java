package interfaces;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ui.util.layouts.ParagraphLayout;

public class FrmCadCliente extends JFrame{

	private JPanel jpnCentro, jpnSul;
	private JTextField txtNome, txtEndereco, txtTelefone;
	
	public FrmCadCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		
		jpnCentro = new JPanel(new ParagraphLayout());
		jpnCentro.setLayout(new ParagraphLayout());
		add(jpnCentro,BorderLayout.CENTER);
		
		
		jpnCentro.add(new JLabel("Nome:"), 
				ParagraphLayout.NEW_PARAGRAPH);
		
		txtNome = new JTextField(25);
		jpnCentro.add(txtNome);
		
		jpnCentro.add(new JLabel("Endereco:"), 
				ParagraphLayout.NEW_PARAGRAPH);
		
		txtEndereco = new JTextField(20);
		jpnCentro.add(txtEndereco);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new FrmCadCliente();
	}
}
