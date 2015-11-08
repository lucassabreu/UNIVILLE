package interfaces;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FrmLogin extends JDialog{

	private JLabel lblLogin, lblSenha;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	private JButton btbOK, btbCancelar;
	private JPanel jpnCentro;
	
	public FrmLogin() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setSize(200,150);
		setModal(true);
		
		criaPainel(); //NAO ESQUECER DE CHAMAR AQUI...!!!
		setVisible(true);
	}
	public void criaPainel(){
		jpnCentro = new JPanel();
		add(jpnCentro,BorderLayout.CENTER);
		jpnCentro.setBorder(BorderFactory.
				createTitledBorder("Login"));
		
		lblLogin = new JLabel("Login:");
		lblSenha = new JLabel("Senha");
		txtLogin = new JTextField(10);
		txtSenha = new JPasswordField(10);
		txtSenha.setEchoChar('_');
		btbOK = new JButton("OK");
		btbCancelar = new JButton("Cancelar");
		
		jpnCentro.add(lblLogin);
		jpnCentro.add(txtLogin);
		jpnCentro.add(lblSenha);
		jpnCentro.add(txtSenha);
		jpnCentro.add(btbOK);
		jpnCentro.add(btbCancelar);
		
	}
	
	public static void main(String[] args) {
		new FrmLogin();
		new FrmCadCliente();
		
	}
}
