package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrmExemplo12 extends JFrame implements ItemListener{
	private JPanel jpnTopo, jpnCentro;
	private JLabel lblCores;
	private JComboBox jcbCores;
	private String cores[] ={"Verde", "Vermelho", "Azul"};
	
	public FrmExemplo12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		criaTopo(); // chamar o metodo no construtor!!!!
		criaCentro(); // NAO ESQUECE DE CHAMAR NO CONSTRUTOR!!!!
		setVisible(true);
	}
	public void criaCentro(){
		jpnCentro = new JPanel();
		add(jpnCentro,BorderLayout.CENTER);
	}
	
	
	public void criaTopo(){
		jpnTopo = new JPanel();
		add(jpnTopo,BorderLayout.NORTH);
		jpnTopo.setBackground(Color.gray);
		lblCores = new JLabel("Cores:");
		jpnTopo.add(lblCores);		
		jcbCores = new JComboBox(cores);
		jcbCores.setName("jcbCores");
		jcbCores.addItemListener(this);
		
//		jcbCores.setEditable(true);
		
		jpnTopo.add(jcbCores);
		
		jcbCores.addItem("Verde");
		jcbCores.addItem("Vermelho");
		jcbCores.addItem("Azul");
		
		jcbCores.setSelectedIndex(-1);
		
		
	}
	public static void main(String[] args) {
		new FrmExemplo12();
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		JComboBox comboSelec = (JComboBox)arg0.getSource();
		
		String cor = (String)comboSelec.getSelectedItem();
		
		System.out.println(cor);
		
		if(cor == null)
			return;
//		if(cor.equals("Verde")){
//			jpnCentro.setBackground(Color.GREEN);
//		}else{
//			if(cor.equals("Vermelho")){
//				jpnCentro.setBackground(Color.RED);
//			}else{
//				if(cor.equals("Azul")){
//					jpnCentro.setBackground(Color.BLUE);
//				}
//			}
//		}
		
		switch (cor) {
			case "Verde":
				jpnCentro.setBackground(Color.GREEN);
			break;
			case "Vermelho":
				jpnCentro.setBackground(Color.RED);
			break;
			case "Azul":
				jpnCentro.setBackground(Color.BLUE);
			break;
		}
	}
}



