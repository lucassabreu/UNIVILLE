package interfaces;
import java.text.NumberFormat;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrmExemplo08 extends JFrame {
	
	NumberFormat formatador = NumberFormat.getNumberInstance();
	
	public FrmExemplo08(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Formatação Valores");
		JTextField valorDecimal = new JTextField(10);
		formatador.setMinimumFractionDigits(10);
		formatador.setMaximumIntegerDigits(10);
		formatador.setMinimumIntegerDigits(10);
		
		valorDecimal.setText(formatador.format(1000.978978d));
		setSize(250,60);
		add(valorDecimal);
		setVisible(true);
	}
	public static void main(String[] args) {
		FrmExemplo08 tela = new FrmExemplo08();
	}
}
