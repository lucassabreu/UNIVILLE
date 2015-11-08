package walter.interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrmExemplo04 extends JFrame 
					implements ActionListener,MouseListener{
	
	private JPanel painel = new JPanel();
	private JButton botao1 = new JButton("Me clica!");
	private JButton botao2 = new JButton("Eu tambem");
	
	public FrmExemplo04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		
		add(painel);
		//fala que eu te escuto...
		botao1.setName("botao1");
		botao1.addActionListener(this);
		botao1.addMouseListener(this);
		
		
		botao2.setName("botao2");
		botao2.addActionListener(this);
		botao2.addMouseListener(this);
		
		
		painel.add(botao1);
		painel.add(botao2);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FrmExemplo04();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton botaoClicado = (JButton) e.getSource();
		if(botaoClicado.getName().equals("botao1")){
			JOptionPane.showMessageDialog(this, "Botao1");
		}else{
			if(botaoClicado.getName().equalsIgnoreCase("Botao2")){
				JOptionPane.showMessageDialog(this, "Botao2");
			}
		}
//		JOptionPane.showMessageDialog(this, 
//				"Me clicaram:" + botaoClicado.getName());
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		setTitle("Entro...");
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		setTitle("Saiu...");
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
