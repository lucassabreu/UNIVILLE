package interfaces;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrmExemplo01 extends JFrame {

	public FrmExemplo01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setTitle("Ola: " + System.getenv("username"));
		//setBounds(500, 300, 200, 100);
		
		ImageIcon imagem = 
				new ImageIcon(
					ClassLoader.getSystemResource("images/duke.png"));
		
		setIconImage(imagem.getImage());
		getContentPane().setBackground(Color.GREEN);
		//getContentPane().setCursor(new Cursor(Cursor.TEXT_CURSOR));
		//setResizable(false);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new FrmExemplo01();
	}
}
