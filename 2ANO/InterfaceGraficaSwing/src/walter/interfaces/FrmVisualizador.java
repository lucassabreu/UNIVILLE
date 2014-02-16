package walter.interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//Gerenciadores
//JFRAME = BorderLayout
//JPanel = FlowLayout
public class FrmVisualizador extends JFrame 

				implements ActionListener {
	
	
	private JPanel jpnCentro, jpnSul;
	private JLabel lblImgCentro;
	private JLabel lblNomeArquivo;
	private JTextField txtArquivo;
	private JButton btbAbrir;
	
	public FrmVisualizador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,500);
	
		jpnCentro = new JPanel();
		jpnCentro.setBorder(BorderFactory.
				createTitledBorder("Imagem"));
		add(jpnCentro,BorderLayout.CENTER);
		lblImgCentro = new JLabel("No Image...");
		jpnCentro.add(lblImgCentro);
		
		
		jpnSul = new JPanel();
		jpnSul.setBackground(Color.GRAY);
		add(jpnSul,BorderLayout.SOUTH);
		lblNomeArquivo = new JLabel("Nome Arquivo");
		jpnSul.add(lblNomeArquivo);
		txtArquivo = new JTextField(40);
		jpnSul.add(txtArquivo);
		btbAbrir = new JButton("Abrir");
		btbAbrir.setName("btbAbrir");
		btbAbrir.addActionListener(this);
		
		
		jpnSul.add(btbAbrir);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FrmVisualizador();
	}
	@Override
	public void actionPerformed(ActionEvent lalala) {
		JButton botaoClicado = (JButton)lalala.getSource();
		if(botaoClicado.getName().equals("btbAbrir")){
			
			//if(!txtArquivo.getText().isEmpty()){
				FileDialog fd =
						new FileDialog(this,"Abrir Arquivo",FileDialog.LOAD);
				fd.show();
				
				ImageIcon img = new ImageIcon(
						fd.getDirectory()+fd.getFile());
				lblImgCentro.setIcon(img);
				lblImgCentro.setText("");
			//}
			
		}
	}
}
