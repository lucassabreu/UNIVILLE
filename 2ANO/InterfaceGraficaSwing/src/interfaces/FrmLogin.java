package interfaces;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import walter.interfaces.FrmCadCliente;

public class FrmLogin extends JDialog {
    private static final long serialVersionUID = -2528788103156684305L;

    private JLabel            lbLogin, lbSenha;
    private JTextField        txLogin;
    private JPasswordField    txSenha;
    private JButton           btOk, btCancelar;
    private JPanel            pnCentro;

    public FrmLogin() {
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setSize(200, 150);
        this.setResizable(false);
        setModal(true);

        this.doPanel();

        this.setVisible(true);
    }

    protected void doPanel() {
        this.pnCentro = new JPanel();
        this.pnCentro.setBorder(BorderFactory.createTitledBorder("Login"));
        this.add(this.pnCentro, BorderLayout.CENTER);

        this.lbLogin = new JLabel("Login");
        this.lbSenha = new JLabel("Senha");

        this.txLogin = new JTextField(10);
        this.txSenha = new JPasswordField(10);
        this.txSenha.setEchoChar('*');

        this.btOk = new JButton("OK");
        this.btCancelar = new JButton("Cancelar");

        this.pnCentro.add(this.lbLogin);
        this.pnCentro.add(this.txLogin);

        this.pnCentro.add(this.lbSenha);
        this.pnCentro.add(this.txSenha);

        this.pnCentro.add(this.btOk);
        this.pnCentro.add(this.btCancelar);
    }

    public static void main(String[] args) {
        new FrmLogin();
        new FrmCadCliente();
    }
}
