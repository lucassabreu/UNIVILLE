package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrmExemp04 extends JFrame implements ActionListener {
	private static final long serialVersionUID = -2261239603784516662L;

	private JPanel panel = new JPanel();
	private JButton button = new JButton("Me clica!");
	
	public FrmExemp04() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400, 400);
		
		this.button.addActionListener(this);
		
		this.panel.add(this.button);
		
		this.add(panel);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FrmExemp04();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(this, "Me clicaram");
		
	}
}
