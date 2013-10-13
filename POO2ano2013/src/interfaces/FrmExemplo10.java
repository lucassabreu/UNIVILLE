package interfaces;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;

public class FrmExemplo10 extends JFrame {
    public FrmExemplo10(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            MaskFormatter mascara = 
            		
            		new MaskFormatter("~10.???.AAA.10.???.***.UUU");
            
            
            JFormattedTextField campoFormatado = 
		new JFormattedTextField(mascara);
	  add(campoFormatado);
	  setTitle("Campo com Mascara");
	  setSize(250,60);
	  setVisible(true);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        FrmExemplo10 tela = new FrmExemplo10();
    }
}
