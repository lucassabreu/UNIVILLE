package interfaces;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class FrmExemploFlowLayout extends JFrame{
	public FrmExemploFlowLayout(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT,100,100));
		JButton btn01 = new JButton("Botão 01");
		add(btn01);
		JButton btn02 = new JButton("Botão 02");
		add(btn02);
		JButton btn03 = new JButton("Botão 03");
		add(btn03);
		JButton btn04 = new JButton("Botão 04");
		add(btn04);	
		JButton btn05 = new JButton("Botão 05");
		add(btn05);
		JButton btn06 = new JButton("Botão 06");
		add(btn06);
		setSize(100,300);
		setTitle("Exemplo FlowLayout");
		setVisible(true);
	}
	public static void main(String args[]){
		FrmExemploFlowLayout tela = new FrmExemploFlowLayout();
	}
}
