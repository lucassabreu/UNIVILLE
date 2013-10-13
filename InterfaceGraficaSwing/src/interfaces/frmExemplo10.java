package interfaces;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import ui.util.layouts.ParagraphLayout;

public class frmExemplo10 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 9061633431711008038L;

	protected JPanel pnCentro;

	protected JCheckBox chVerde;
	protected JCheckBox chAmarelo;
	protected JCheckBox chVermelho;

	protected JRadioButton rbVerde;
	protected JRadioButton rbAmarelo;
	protected JRadioButton rbVermelho;

	public frmExemplo10() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);

		this.doPanel();

		this.setVisible(true);
	}

	protected void doPanel() {
		this.pnCentro = new JPanel(new ParagraphLayout());

		this.chVerde = new JCheckBox("Verde");
		this.chVerde.setName("chVerde");
		this.pnCentro.add(this.chVerde);
		
		this.chVerde.addActionListener(this);

		this.chAmarelo = new JCheckBox("Amarelo");
		this.chAmarelo.setName("chAmarelo");
		this.pnCentro.add(this.chAmarelo);

		this.chVermelho = new JCheckBox("Vermelho");
		this.chVermelho.setName("chVermelho");
		this.pnCentro.add(this.chVermelho);

		this.rbVerde = new JRadioButton("Verde");
		this.rbVerde.setName("rbVerde");
		this.pnCentro.add(this.rbVerde, ParagraphLayout.NEW_PARAGRAPH);

		this.rbAmarelo = new JRadioButton("Amarelo");
		this.rbAmarelo.setName("rbAmarelo");
		this.pnCentro.add(this.rbAmarelo);

		this.rbVermelho = new JRadioButton("Vermelho");
		this.rbVermelho.setName("rbVermelho");
		this.pnCentro.add(this.rbVermelho);
		
		this.rbVermelho.addActionListener(this);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(this.rbVerde);
		bg.add(this.rbAmarelo);
		bg.add(this.rbVermelho);

		this.add(this.pnCentro, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new frmExemplo10();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() instanceof JRadioButton) {
			JRadioButton rb = (JRadioButton) event.getSource();
		} else {
			if(event.getSource() instanceof JCheckBox){
				JCheckBox ch = (JCheckBox) event.getSource();
			}
		}
	}

}
