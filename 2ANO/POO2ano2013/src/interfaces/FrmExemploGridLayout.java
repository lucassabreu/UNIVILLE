package interfaces;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class FrmExemploGridLayout extends JFrame{
	public FrmExemploGridLayout(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,2));
		add(new JButton("Botao01"));
		add(new JButton("Botao02"));
		add(new JButton("Botao03"));
		add(new JButton("Botao04"));
		add(new JButton("Botao05"));
		add(new JButton("Botao06"));
		add(new JButton("Botao07"));
		setSize(450,100);
		setTitle("Exemplo GridLayout");
		setVisible(true);
	}
	public static void main(String args[]){
		FrmExemploGridLayout tela = new FrmExemploGridLayout();
	}
}
