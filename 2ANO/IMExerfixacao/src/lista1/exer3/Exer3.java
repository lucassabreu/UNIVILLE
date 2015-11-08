package lista1.exer3;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exer3 extends JFrame implements ActionListener {
    private static final long serialVersionUID = -5839205603727208422L;

    private JTextField        txNum1;
    private JTextField        txNum2;
    private JTextField        txNum3;

    private JLabel            lbX;
    private JLabel            lbResult;

    private JButton           btIgual;

    private JPanel            panel;

    public Exer3() {
        this.setTitle("Regra de Três");
        this.setSize(200, 150);

        this.panel = new JPanel(new GridLayout(2, 3));
        
        this.txNum1 = new JTextField();
        this.txNum2 = new JTextField();
        this.txNum3 = new JTextField();

        this.lbX = new JLabel("X");
        this.lbX.setFont(new Font(null, Font.BOLD, 16));

        
        this.add(this.panel);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Exer3();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub

    }
}
