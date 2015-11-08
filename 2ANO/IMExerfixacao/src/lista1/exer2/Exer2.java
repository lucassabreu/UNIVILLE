package lista1.exer2;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exer2 extends JFrame implements ActionListener {

    private static final long serialVersionUID = 8620875609980565834L;
    private JLabel[]          labels;
    private JTextField        txOportunidade;
    private JTextField        txRecomecar;
    private JTextField        txInteligencia;
    private JButton           btCorrigir;
    private JPanel            panel;

    public Exer2() {
        this.setTitle("Complete a frase");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 100);

        this.labels = new JLabel[4];

        this.panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        this.labels[0] = new JLabel("O insucesso é apenas uma ");
        this.panel.add(this.labels[0]);

        this.txOportunidade = new JTextField();
        this.txOportunidade.setColumns(12);
        this.panel.add(this.txOportunidade);

        this.labels[1] = new JLabel(" para ");
        this.panel.add(this.labels[1]);

        this.txRecomecar = new JTextField();
        this.txRecomecar.setColumns(9);
        this.panel.add(this.txRecomecar);

        this.labels[2] = new JLabel(" de novo com mais ");
        this.panel.add(this.labels[2]);

        this.txInteligencia = new JTextField();
        this.txInteligencia.setColumns(12);
        this.panel.add(this.txInteligencia);

        this.labels[3] = new JLabel(" \"Henry Ford\"");
        this.panel.add(this.labels[3]);

        this.btCorrigir = new JButton("Corrigir");
        this.btCorrigir.setName("btCorrigir");
        this.btCorrigir.addActionListener(this);

        this.panel.add(this.btCorrigir);

        this.add(this.panel);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Exer2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Component c = (Component) e.getSource();

        if (c.getName().equals("btCorrigir")) {
            if (this.txInteligencia.getText().equalsIgnoreCase("inteligencia") && this.txOportunidade
                            .getText().equalsIgnoreCase("oportunidade") && this.txRecomecar
                            .getText().equalsIgnoreCase("recomeçar")) {
                JOptionPane.showMessageDialog(this, "Correto!!!");
            } else {
                JOptionPane.showMessageDialog(this, "Existe algo errado...", "", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
