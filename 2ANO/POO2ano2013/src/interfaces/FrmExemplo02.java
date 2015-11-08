package interfaces;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class FrmExemplo02 extends JFrame {
	public FrmExemplo02() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		
		JPanel painel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		//painel.setBorder(BorderFactory.createLineBorder(Color.RED,30));
		painel.setBorder(
				BorderFactory.createTitledBorder("Ola Enfermeira"));
		
		JLabel label = new JLabel("Hello World!!!");
		label.setFont(new Font("Arial",Font.BOLD | Font.ITALIC,40));
		label.setBackground(Color.RED);
		label.setOpaque(true);
		label.setForeground(new Color(100,100,100));
		
		JLabel label2 = new JLabel("Ola Enfermeira!!!");
		label2.setFont(new Font("Arial",Font.PLAIN,40));
		
		ImageIcon imagem = 
				new ImageIcon(
					ClassLoader.getSystemResource("images/duke.png"));
		
		JLabel labelImagem = new JLabel();
		
		labelImagem.
			setToolTipText("<html>Figura:<br><img src='http://s2.glbimg.com/pK-ASAqngs0mTPH9mKg89oYTY9Q=/0x156:620x351/300x94/s.glbimg.com/jo/g1/f/original/2013/08/08/italy_orson_welles_fi_fran3.jpg'/></html>");
		labelImagem.setIcon(imagem);
		
		painel.add(label);
		
		JButton macaco = new JButton("posso alterar o codigo em qualquer ponto");
		painel.add(macaco);
		painel.add(label2);
		painel.add(labelImagem);
		
		getContentPane().add(painel);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new FrmExemplo02();
	}
}
