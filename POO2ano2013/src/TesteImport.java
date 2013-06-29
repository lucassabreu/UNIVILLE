import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class TesteImport {

	public static void main(String[] args) {
		Date agora = new Date();
		
		SimpleDateFormat formatador
			= new SimpleDateFormat("dd/MM/yyyy");
		
		SimpleDateFormat formatador2
			= new SimpleDateFormat("HH:mm:ss");
		
		System.out.println(formatador.format(agora));
		
		System.out.println(formatador2.format(agora));
		
		JOptionPane.showMessageDialog(null, "Data:" + 
					formatador.format(agora) + "\n Hora: " +
					formatador2.format(agora));
		
		
		String retorno = JOptionPane.showInputDialog("Digita a data de nascimento?");
	
		try {
			JOptionPane.showMessageDialog(null, formatador.parse(retorno));
		} catch (HeadlessException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}




