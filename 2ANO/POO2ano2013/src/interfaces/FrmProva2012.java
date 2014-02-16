package interfaces;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.text.MaskFormatter;

import ui.util.layouts.ParagraphLayout;

public class FrmProva2012 extends JFrame implements ActionListener {
    private JPanel      jpnCentro, jpnSul;
    private JScrollPane jpnDireita;
    private JButton     btbCalcula, btbConfirma, btbCancela;
    private JTextArea   txtPeticao;
    private JPanel      jpnCNorte, jpnCCentro, jpnCSul;

    private JFormattedTextField txtNumero, txtData;
    private JTextArea           txtDescricao;
    private JComboBox           jcbVara;
    private JTextField          txtJuiz;
    private MaskFormatter       formNumero, formData;

    private JTextField          txtParte1, txtParte2;
    private JRadioButton        jrbAutor1, jrbReu1, jrbAutor2, jrbReu2;

    private JCheckBox           jcbAssist1, jcbAssist2;

    private JTextField          txtValorTotal, txtPercAdv, txtValAdv;
    private NumberFormat        nf;

    public FrmProva2012() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 470);
        setTitle("Manutenção de Processos");
        criaJpnCentro();
        criaJpnSul();
        criaJpnDireita();
        criaMenuBar();
        setVisible(true);
    }

    private void criaMenuBar() {
        JMenuBar menubar = new JMenuBar();
        this.setJMenuBar(menubar);

        JMenu mPrincipal = new JMenu("Principal");
        menubar.add(mPrincipal);

        JMenuItem miArquivo = new JMenuItem("Arquivo");
        mPrincipal.add(miArquivo);

        JMenu mSalvar = new JMenu("Salvar");
        mPrincipal.add(mSalvar);
        
        JMenuItem miSalvar = new JMenuItem("Salvar");
        mSalvar.add(miSalvar);
        
        mPrincipal.addSeparator();
        
        JMenuItem miSair = new JMenuItem("Sair");
        miSair.setName("btbCancela");
        miSair.addActionListener(this);
        mPrincipal.add(miSair);
    }

    private void criaJpnCentro() {

        try {
            formNumero = new MaskFormatter("#######-##.####.#.##.####");
            formData = new MaskFormatter("##/##/####");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        jpnCentro = new JPanel(new BorderLayout());
        add(jpnCentro, BorderLayout.CENTER);
        jpnCentro.setBorder(BorderFactory
                        .createTitledBorder("Dados do processo"));

        jpnCCentro = new JPanel(new ParagraphLayout());
        jpnCCentro.setBorder(BorderFactory
                        .createTitledBorder("Dados das Partes"));
        jpnCentro.add(jpnCCentro, BorderLayout.CENTER);
        // aquiiiiiiiiii CODIGO DO CENTRO (OHHH)
        jpnCCentro.add(new JLabel("Parte 1:"), ParagraphLayout.NEW_PARAGRAPH);
        txtParte1 = new JTextField(15);
        jpnCCentro.add(txtParte1);

        jrbAutor1 = new JRadioButton("Autor");
        jrbReu1 = new JRadioButton("Réu");
        jcbAssist1 = new JCheckBox("Assistência Judiciária");
        jpnCCentro.add(jrbAutor1);
        jpnCCentro.add(jrbReu1);
        jpnCCentro.add(jcbAssist1);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(jrbAutor1);
        bg1.add(jrbReu1);

        jpnCCentro.add(new JLabel("Parte 2:"), ParagraphLayout.NEW_PARAGRAPH);

        txtParte2 = new JTextField(15);
        jpnCCentro.add(txtParte2);

        jrbAutor2 = new JRadioButton("Autor");
        jrbReu2 = new JRadioButton("Réu");
        jcbAssist2 = new JCheckBox("Assistência Judiciária");
        jpnCCentro.add(jrbAutor2);
        jpnCCentro.add(jrbReu2);
        jpnCCentro.add(jcbAssist2);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(jrbAutor2);
        bg2.add(jrbReu2);

        // aquiiiiiiiiii CODIGO DO CENTRO (OHHH)

        jpnCSul = new JPanel(new ParagraphLayout());
        jpnCentro.add(jpnCSul, BorderLayout.SOUTH);

        // aquiiiiiiiiiiiiiiiii CODIGO DO SUL (OHHH)

        this.nf = NumberFormat.getNumberInstance();

        jpnCSul.add(new JLabel("Valor Total R$"), ParagraphLayout.NEW_PARAGRAPH);
        txtValorTotal = new JFormattedTextField(this.nf); // new JTextField(10);
        this.txtValorTotal.setColumns(10);
        jpnCSul.add(txtValorTotal);

        jpnCSul.add(new JLabel("Perc Adv:"));
        txtPercAdv = new JFormattedTextField(this.nf); // new JTextField(10);
        this.txtPercAdv.setColumns(10);
        jpnCSul.add(txtPercAdv);

        jpnCSul.add(new JLabel("Valor Adv:"));
        txtValAdv = new JFormattedTextField(this.nf); // new JTextField(10);
        this.txtValAdv.setColumns(10);
        txtValAdv.setEditable(false);
        jpnCSul.add(txtValAdv);

        // aquiiiiiiiiiiiiiiiii CODIGO DO SUL (OHHH)

        jpnCNorte = new JPanel(new ParagraphLayout());
        jpnCNorte.setBorder(BorderFactory.createTitledBorder("Identificação"));
        jpnCentro.add(jpnCNorte, BorderLayout.NORTH);
        // aqui CODIGO DO NORTE (OHHHH)
        jpnCNorte.add(new JLabel("Numero"), ParagraphLayout.NEW_PARAGRAPH);

        txtNumero = new JFormattedTextField(formNumero);
        // System.out.println(txtNumero.getPreferredSize());
        txtNumero.setPreferredSize(new Dimension(200, 20));
        jpnCNorte.add(txtNumero);

        jpnCNorte.add(new JLabel("Descrição:"), ParagraphLayout.NEW_PARAGRAPH);
        txtDescricao = new JTextArea(3, 40);
        jpnCNorte.add(new JScrollPane(txtDescricao));

        jpnCNorte.add(new JLabel("Vara:"), ParagraphLayout.NEW_PARAGRAPH);
        jcbVara = new JComboBox();
        jcbVara.addItem("Primeira");
        jcbVara.addItem("Segunda");
        jcbVara.addItem("Terceira");
        jpnCNorte.add(jcbVara);

        jpnCNorte.add(new JLabel("Juiz:"), ParagraphLayout.NEW_PARAGRAPH);
        txtJuiz = new JTextField(20);
        jpnCNorte.add(txtJuiz);

        jpnCNorte.add(new JLabel("Data Início:"), ParagraphLayout.NEW_PARAGRAPH);
        txtData = new JFormattedTextField(formData);
        txtData.setPreferredSize(new Dimension(100, 20));
        jpnCNorte.add(txtData);

        // aqui CODIGO DO NORTE (OHHHH)
    }

    private void criaJpnSul() {
        jpnSul = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        add(jpnSul, BorderLayout.SOUTH);

        btbCalcula = new JButton("Calcula");
        this.btbCalcula.setName("btbCalcula");
        this.btbCalcula.addActionListener(this);
        btbConfirma = new JButton("Confirma");
        this.btbConfirma.setName("btbConfirma");
        this.btbConfirma.addActionListener(this);
        btbCancela = new JButton("Cancela");
        this.btbCancela.setName("btbCancela");
        this.btbCancela.addActionListener(this);

        jpnSul.add(btbCalcula);
        jpnSul.add(btbConfirma);
        jpnSul.add(btbCancela);

    }

    private void criaJpnDireita() {

        txtPeticao = new JTextArea(20, 20);

        // txtPeticao.setPreferredSize(new Dimension(50,30));

        jpnDireita = new JScrollPane(txtPeticao);
        jpnDireita.setBorder(BorderFactory
                        .createTitledBorder("Petição Inicial"));
        add(jpnDireita, BorderLayout.EAST);

    }

    @Override
    public void actionPerformed(ActionEvent evnt) {
        if (evnt.getSource() instanceof Component) {
            Component comp = (Component) evnt.getSource();

            if (comp.getName().equals("btbCalcula")) {
                float valorTotal;
                try {
                    valorTotal = this.nf.parse(this.txtValorTotal.getText())
                                    .floatValue();

                    float percAdv = this.nf.parse(this.txtPercAdv.getText())
                                    .floatValue();

                    float valAdv = (valorTotal * percAdv) / 100f;

                    if ((this.jrbAutor1.isSelected() && this.jcbAssist1
                                    .isSelected()) //
                                    || (this.jrbAutor2.isSelected() && this.jcbAssist2
                                                    .isSelected())) {
                        valAdv = valAdv / 2f;
                    }

                    txtValAdv.setText(String.valueOf(valAdv));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            } else if (comp.getName().equals("btbCancela")) {
                this.dispose();
            }
        }
    }

    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException
                        | IllegalAccessException
                        | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        
        new FrmProva2012();
    }
}
