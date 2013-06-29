
public class ExemploString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String minhaFrase = "Ola Enfermeira!!!";
		System.out.println(minhaFrase);
		System.out.println("Posicao 5:" + minhaFrase.charAt(5));
		System.out.println(minhaFrase.concat(" Td bem?"));
		
		System.out.println(minhaFrase.equals("Laranja"));
		System.out.println(minhaFrase.equals("Ola enfermeira!!!"));
		System.out.println(minhaFrase.equalsIgnoreCase("OlA eNfErMeIrA!!!"));
		System.out.println(minhaFrase.length());
		System.out.println(minhaFrase.isEmpty());
		
		System.out.println(minhaFrase.indexOf("ra"));
		System.out.println(minhaFrase.replace('a', '$').replace("e", "!"));
		
//		String aux = minhaFrase.replace('a', '$');
//		aux = aux.replace("e", "!");
//		System.out.println(aux);
		
		System.out.println(minhaFrase.replace(" ", ""));
		System.out.println(minhaFrase.startsWith("Ola"));
		System.out.println(minhaFrase.endsWith("Enfermeira!!!"));
		System.out.println(minhaFrase.toUpperCase());
		System.out.println(minhaFrase.toLowerCase());
		
		System.out.println(minhaFrase.subSequence(4, 14));
		
		minhaFrase = "      " + minhaFrase + "         ";
		System.out.print("inicio");
		System.out.print(minhaFrase);
		System.out.print("fim\n");
		System.out.println(minhaFrase.trim());
	}

}








