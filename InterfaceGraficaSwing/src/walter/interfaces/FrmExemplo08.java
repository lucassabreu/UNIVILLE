package walter.interfaces;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JTextField;

import org.omg.CORBA.LocalObject;

public class FrmExemplo08 extends JFrame {
    
    Locale locale = Locale.UK;// Locale.getDefault();

    NumberFormat formatador = NumberFormat.getNumberInstance(locale);

    public FrmExemplo08() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Formatação Valores : " + locale.getDisplayCountry());
        JTextField valorDecimal = new JTextField(10);
        formatador.setMinimumFractionDigits(3);
        formatador.setMaximumIntegerDigits(4);
        valorDecimal.setText(formatador.format(1000.978978d));
        setSize(250, 60);
        add(valorDecimal);
        setVisible(true);
    }

    public static void main(String[] args) {
        FrmExemplo08 tela = new FrmExemplo08();
    }
}
