package edu.univille.poo;

public class ExemploString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String minhaFrase = "Ola enfermeira!!!";
		
		System.out.println(minhaFrase);
		//Retorna caracter na posição 5
		System.out.println("Posição 5:" + minhaFrase.charAt(5));
		//Concatena caracteres no final da frase
		System.out.println(minhaFrase.concat(" Td bem?"));
		//Compara se os valores são iguais
		System.out.println(minhaFrase.equals("Laranja"));
		System.out.println(minhaFrase.equals("Ola enfermeira!!!"));
		
		System.out.println(minhaFrase.replace("a", "e"));
		
		System.out.println(minhaFrase.replace(" ", ""));
		System.out.println(minhaFrase.startsWith("Ola"));
		
		// nem deu para copiar tudo
	}


}
