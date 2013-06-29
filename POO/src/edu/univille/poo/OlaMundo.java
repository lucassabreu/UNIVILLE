package edu.univille.poo;
import java.io.IOException;
import java.util.Scanner;


public class OlaMundo {

	protected static Scanner scan = null;
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);
		
		System.out.print("TEXTO: ");
		
		String texto = scan.nextLine();

		System.out.println(String.format("ORIGINAL: %s.", texto));
		System.out.println(String.format("UPPER:    %s.", texto.toUpperCase()));
		System.out.println(String.format("LOWER:    %s.", texto.toLowerCase()));
	}

}
