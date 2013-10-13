package interfaces.bim3;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class FrmExemploJList extends JFrame implements ActionListener {

    private static final long          serialVersionUID = -9092031747409792044L;

    // panels
    protected JPanel                   pnNorth, pnEast;
    protected JScrollPane              spCenter;

    // inputs
    protected JList<String>            lsLista;
    protected JTextField               txDados;

    // controles
    protected DefaultListModel<String> lmLista;

    // actions
    protected JButton                  btAdicionar, btRemover, btAtualizar;

    public FrmExemploJList() {
        this.setTitle("JList - Exemplo");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        doNorth();
        doCenter();
        doEast();

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evnt) {
        if (evnt.getSource() instanceof Component) {
            Component c = (Component) evnt.getSource();

            if (c.getName().equals("adicionar")) {
                String texto = this.txDados.getText().trim();

                if (texto.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Caixa de Texto em Branco!!!", null, JOptionPane.ERROR_MESSAGE);
                    return;
                }

                this.lmLista.addElement(this.txDados.getText());
                this.lsLista.setSelectedIndex(this.lmLista.size() - 1);
            } else {
                if (c.getName().equals("remover")) {
                    if (this.lsLista.getSelectedIndex() >= 0) {
                        this.lmLista.remove(this.lsLista.getSelectedIndex());
                    }
                } else {
                    if (c.getName().equals("atualizar")) {
                        String texto = this.txDados.getText().trim();

                        if (texto.isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Caixa de Texto em Branco!!!", null, JOptionPane.ERROR_MESSAGE);
                            return;
                        } else {
                            if (this.lsLista.getSelectedIndex() < 0) {
                                JOptionPane.showMessageDialog(this, "Nenhum item selecionado!!!", null, JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }

                        this.lmLista.setElementAt(this.txDados.getText(), this.lsLista.getSelectedIndex());
                    }
                }
            }

            if (c.getName().equals("adicionar") || c.getName().equals("atualizar")) {
                this.txDados.setText("");
                this.txDados.requestFocus();
            }
        }
    }

    private void doNorth() {
        this.pnNorth = new JPanel(new BorderLayout());

        this.txDados = new JTextField();
        this.pnNorth.add(this.txDados, BorderLayout.CENTER);

        this.add(this.pnNorth, BorderLayout.NORTH);
    }

    private void doCenter() {
        this.lmLista = new DefaultListModel<String>();
        this.lsLista = new JList<String>(this.lmLista);
        this.spCenter = new JScrollPane(this.lsLista);
        this.add(this.spCenter, BorderLayout.CENTER);
    }

    private void doEast() {
        this.pnEast = new JPanel(new GridLayout(4, 1));

        this.btAdicionar = new JButton("Adicionar");
        this.btAdicionar.setName("adicionar");
        this.btAdicionar.addActionListener(this);

        this.btRemover = new JButton("Remover");
        this.btRemover.setName("remover");
        this.btRemover.addActionListener(this);

        this.btAtualizar = new JButton("Atualizar");
        this.btAtualizar.setName("atualizar");
        this.btAtualizar.addActionListener(this);

        this.pnEast.add(this.btAdicionar);
        this.pnEast.add(this.btRemover);
        this.pnEast.add(this.btAtualizar);

        this.add(this.pnEast, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        new FrmExemploJList();
    }

}
