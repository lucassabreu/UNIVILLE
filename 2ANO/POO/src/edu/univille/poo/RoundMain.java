package edu.univille.poo;

import java.util.Scanner;

public class RoundMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double d = 0;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Informe um numero: ");
		d = scan.nextDouble();

		if (d == Math.round(d))
			System.out.println("Inteiro");
		else
			System.out.println("Decimal");
		
		scan.close();
	}

}
