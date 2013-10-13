package interfaces.bim3.dri;

import java.awt.BorderLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class FrmPai extends JFrame {
    private static final long serialVersionUID = -643617580422672501L;
    protected JDesktopPane    desktopCentral;

    public FrmPai() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);

        this.desktopCentral = new JDesktopPane();
        this.add(desktopCentral, BorderLayout.CENTER);

        FrmFilho f1 = new FrmFilho();
        this.desktopCentral.add(f1);

        FrmFilho f2 = new FrmFilho();
        this.desktopCentral.add(f2);

        FrmFilho f3 = new FrmFilho();
        this.desktopCentral.add(f3);

        FrmFilho f4 = new FrmFilho();
        this.desktopCentral.add(f4);

        this.setVisible(true);
    }

    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel(NimbusLookAndFeel.class.getCanonicalName());

        new FrmPai();
    }
}
