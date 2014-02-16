package controlefinanceiro.form;

import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import ui.util.layouts.ParagraphLayout;

import com.toedter.calendar.JDateChooser;

import controlefinanceiro.dao.Despesa;

public class DlgDespesaDetail extends JDialog {

    private JPanel              pnCentro, pnSul;

    private JTextArea           txDescricao;
    private JFormattedTextField txValor;
    private JDateChooser        dcData;
    private JComboBox           cbTipo;
    private JCheckBox           chPago;

    private JButton             btSalvar, btFechar;

    private Despesa             model;

    public DlgDespesaDetail() {
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setSize(400, 200);
        this.setModal(true);

        this.doCenter();

        this.setVisible(true);
    }

    private void doCenter() {
        this.pnCentro = new JPanel(new ParagraphLayout());

        this.txDescricao = new JTextArea(3, 20);
        this.pnCentro.add(new JLabel("Descrição:"), ParagraphLayout.NEW_PARAGRAPH);
        this.pnCentro.add(new JScrollPane(this.txDescricao));

        this.txValor = new JFormattedTextField(NumberFormat.getNumberInstance());
        this.txValor.setColumns(12);
        this.pnCentro.add(new JLabel("Valor:"), ParagraphLayout.NEW_PARAGRAPH);
        this.pnCentro.add(this.txValor);

        this.dcData = new JDateChooser();
        this.pnCentro.add(new JLabel("Data:"), ParagraphLayout.NEW_PARAGRAPH);
        this.pnCentro.add(this.dcData);

        this.cbTipo = new JComboBox();
        this.pnCentro.add(new JLabel("Tipo:"), ParagraphLayout.NEW_PARAGRAPH);
        this.pnCentro.add(this.cbTipo);
        
        this.chPago = new JCheckBox("Pago");
        this.pnCentro.add(new JLabel(""), ParagraphLayout.NEW_PARAGRAPH);
        this.pnCentro.add(this.chPago);

        this.add(this.pnCentro);
    }

    public static void main(String[] args) {
        new DlgDespesaDetail();
    }

}
