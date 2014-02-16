package interfaces;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrmExemplo01 extends JFrame {

	private static final long serialVersionUID = -3155479535024320556L;

	public FrmExemplo01() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Titulo");
		//setResizable(false);
		
		ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("images/images.gif"));

		setIconImage(image.getImage());
		
		setBounds(200, 200, 300, 100);
		
		getContentPane().setBackground(Color.green);
		//getContentPane().setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new FrmExemplo01();
	}
}
