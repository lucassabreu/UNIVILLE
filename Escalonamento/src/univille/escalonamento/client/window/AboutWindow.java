package univille.escalonamento.client.window;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import java.awt.Rectangle;

public class AboutWindow extends JFrame {
    public AboutWindow() {
        setBounds(new Rectangle(0, 0, 473, 300));
        setResizable(false);
        setTitle("Sobre JARVIS");
        
        JLabel lblJ = new JLabel("JARVIS - Simulador de Escalonamento de Processos");
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        JTextArea txtrDesenvolvidoPorLucas = new JTextArea();
        txtrDesenvolvidoPorLucas.setEditable(false);
        txtrDesenvolvidoPorLucas.setLineWrap(true);
        txtrDesenvolvidoPorLucas.setWrapStyleWord(true);
        txtrDesenvolvidoPorLucas.setText("Desenvolvido por:\r\n\tLucas dos Santos Abreu\r\n\tFabricio Felisbino\r\n\r\nData de compila\u00E7\u00E3o:\r\n\t30 de Abril de 2013\r\n\r\n2\u00BA ano de Sistemas de Informa\u00E7\u00E3o - UNIVILLE\r\n\r\n(Proibida a comercializa\u00E7\u00E3o deste software, sendo seu uso limitado a demonstra\u00E7\u00F5es acad\u00EAmicas)");
        scrollPane.setColumnHeaderView(txtrDesenvolvidoPorLucas);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                    .addGap(10)
                    .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addComponent(lblJ, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                        .addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                    .addContainerGap())
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblJ)
                    .addGap(17)
                    .addComponent(scrollPane)
                    .addGap(16))
        );
        getContentPane().setLayout(groupLayout);
    }

    private static final long serialVersionUID = 1178974650499632352L;
}
