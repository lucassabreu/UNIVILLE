package walter.interfaces;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrmExemploBorderLayout extends JFrame {

    private static final long serialVersionUID = 5374772766591974463L;

    public FrmExemploBorderLayout() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add("North", new JButton("Area Superior"));
        add("South", new JButton("Area Inferior"));
        // add("West",new JButton("Area Esquerda"));
        // add("East",new JButton("Area Direita"));
        add("Center", new JLabel("Area Central", JLabel.CENTER));
        setSize(400, 300);
        setTitle("Exemplo BorderLayout");
        setVisible(true);
    }

    public static void main(String[] args) {
        FrmExemploBorderLayout tela = new FrmExemploBorderLayout();
    }

}
