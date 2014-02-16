package edu.univille.poo;

public class AutoBoxing {
	@SuppressWarnings("unused")
    public static void main(String[] args) {
		int idade = 20;
		Integer minhaIdade = 20;
		Integer minhaIdade2 = new Integer(20);
		
		long timeIni = System.currentTimeMillis();

		for(Integer i = 0; i < 99999999; ) {
			i = i + 1;
		}
		
		long timeFim = System.currentTimeMillis();

		long diff = timeFim - timeIni;
		System.out.println("Tempo: " + diff);
	}
}
