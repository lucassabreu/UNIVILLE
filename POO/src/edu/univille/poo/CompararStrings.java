package edu.univille.poo;

public class CompararStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fruta = "laranja";
		
		System.out.println(fruta.equals("banana")); // false
		System.out.println(fruta.equals("laranja")); // true
		
		System.out.println(fruta == "laranja"); // true <- it's a trap
		
		System.out.println(fruta == new String("laranja")); // false
	}

}
