package interfaces.bim3.dri;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrmFilho extends JInternalFrame {
    private static final long serialVersionUID = -4235853144250059720L;

    public FrmFilho() {
        super("Titulo", true, true, true, true);
        this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        this.setSize(300, 300);
        
        JPanel pnCenter = new JPanel();
        JTextField txName = new JTextField();
        txName.setColumns(20);
        
        pnCenter.add(txName);
        
        this.add(pnCenter);
        
        this.setVisible(true);
    }
}
