package edu.univille.poo;

import java.io.DataInputStream;
import java.io.IOException;

public class TesteWrapper {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "unused", "deprecation" })
    public static void main(String[] args) {

		if (args.length != 3) {
			System.out
					.println("Este programa exige que seja passado uma expressão no formato: num1 + num2.");
			return;
		}

		int num1 = 0;
		int num2 = 0;
		float result = 0f;
		char op = 0;

		DataInputStream dis = new DataInputStream(System.in);

		String linha = null;
		try {
			linha = dis.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		try {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[0]);
		} catch (Exception e) {
			System.out
					.println("O programa precisa que sejam passados parametros no seguinte formato: num1 + num2.");
			return;
		}

		op = args[1].charAt(0);

		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			System.out.println("Esse operador não é suportado.");
			break;
		}

		System.out.println("O resultado é " + result);
	}
}
