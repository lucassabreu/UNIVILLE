package interfaces;
import java.text.NumberFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrmExemplo09 extends JFrame {
	//Busca localização do sistema operacional
	//Locale localizacao = Locale.getDefault();
	Locale localizacao = Locale.FRANCE;
	NumberFormat formatador = NumberFormat.getInstance(localizacao);
	public FrmExemplo09(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField campo = new JTextField(10);
		campo.setText(formatador.format(1000.23));
		setTitle("Localização: " + localizacao.getDisplayLanguage());
		add(campo);
		setSize(250,60);
		setVisible(true);
	}
	public static void main(String[] args) {
		FrmExemplo09 tela = new FrmExemplo09();
	}
}
