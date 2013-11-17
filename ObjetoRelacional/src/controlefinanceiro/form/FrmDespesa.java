package controlefinanceiro.form;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class FrmDespesa extends JFrame {
    private static final long serialVersionUID = 1L;

    private JScrollPane       spCentro;
    private JPanel            pnSul;

    private TableModelDespesa tmDespesa;
    private JTable            tbDespesas;

    private JButton           btIncluir, btAlterar, btRemover;

    public FrmDespesa() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 500);

        doCentro();
        doSul();

        setVisible(true);
    }

    private void doCentro() {
        this.tmDespesa = new TableModelDespesa();
        this.tbDespesas = new JTable(this.tmDespesa);
        this.spCentro = new JScrollPane(this.tbDespesas);

        this.add(this.spCentro, BorderLayout.CENTER);
    }

    private void doSul() {
        this.pnSul = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        this.btIncluir = new JButton("Incluir");
        this.btIncluir.setName("incluir");

        this.btAlterar = new JButton("Alterar");
        this.btAlterar.setName("alterar");

        this.btRemover = new JButton("Remover");
        this.btRemover.setName("remover");

        this.pnSul.add(this.btIncluir);
        this.pnSul.add(this.btAlterar);
        this.pnSul.add(this.btRemover);

        this.add(this.pnSul, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new FrmDespesa();
    }
}
