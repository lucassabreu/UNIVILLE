
public class TesteAutoBox {
	public static void main(String[] args) {
		int idade = 20;
		Integer minhaIdade = 20;
		Integer minhaIdade2 = new Integer(20);
		
		long tempoIni = System.currentTimeMillis();
		for(int x = 0; x<999999999; ){
			x = x + 1;
		}
		long tempoFim = System.currentTimeMillis();
		long diff = tempoFim - tempoIni;
		System.out.println("Tempo: " + diff);
	}
}
