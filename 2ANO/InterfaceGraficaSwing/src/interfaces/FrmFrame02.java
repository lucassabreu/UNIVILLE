package interfaces;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrmFrame02 extends JFrame {

	private static final long serialVersionUID = 1959144634211912713L;

	public FrmFrame02() {
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		// panel.setBackground(Color.pink);
		// panel.setBorder(BorderFactory.createLineBorder(Color.red, 30));
		panel.setBorder(BorderFactory.createTitledBorder("Ola Enfermeira"));

		JLabel label01 = new JLabel("Hello World!!!");

		panel.add(label01);
		
		JLabel label02 = new JLabel("Alo Mundo");
		
		label02.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 40));
		label02.setBackground(Color.red);
		label02.setForeground(Color.green);
		label02.setOpaque(true);
		panel.add(label02);

		ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("images/images.gif"));

		JLabel labelImage = new JLabel();
		labelImage.setIcon(image);
		labelImage.setToolTipText("<html>Figura:<br /><img src='http://laughterforyou.com/wp-content/uploads/2012/10/I-should-buy-a-boat.jpg' /></html>");
		panel.add(labelImage);
		
		getContentPane().add(panel);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new FrmFrame02();
	}

}
