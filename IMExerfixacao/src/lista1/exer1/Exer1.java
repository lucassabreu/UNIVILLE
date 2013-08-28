package lista1.exer1;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Exer1 extends JFrame {

	private static final long serialVersionUID = -6985253635966172919L;

	protected JLabel image;
	protected JTextField txArquivo;

	public Exer1() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setTitle("Visualizador de Imagens");

		this.getContentPane().setLayout(new BorderLayout(10, 10));

		JPanel top = new JPanel();

		this.image = new JLabel("<no image found>");

		top.add(this.image);
		this.getContentPane().add(new JScrollPane(top), BorderLayout.CENTER);

		JPanel bottom = new JPanel();
		bottom.setBackground(Color.gray);

		JLabel lblArquivo = new JLabel("Nome Arquivo:");
		bottom.add(lblArquivo);

		this.txArquivo = new JTextField(50);
		bottom.add(this.txArquivo);

		JButton btLoadImage = new JButton("Abrir");

		btLoadImage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				onClick();
			}
		});

		bottom.add(btLoadImage);

		this.getContentPane().add(bottom, BorderLayout.SOUTH);

		this.setVisible(true);
	}

	public void onClick() {
		try {
			if (!this.txArquivo.getText().trim().equals("")) {
				ImageIcon imageIcon = new ImageIcon(this.txArquivo.getText());
				this.image.setText("");
				this.image.setIcon(imageIcon);
			} else {
				this.image.setText("<no image found>");
			}
		} catch (Exception e) {
			this.image.setText("<no image found>");
            JOptionPane.showMessageDialog(this, "Informe i nome de um arquivo de imagem");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Exer1();
	}

}
