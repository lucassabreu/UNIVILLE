package br.univille.lucas.abreu;
public class FuncaoAckermann {
	public static void main(String[] args) {
		// não considerar essa lógica para o programa
		long tempoInicial = System.currentTimeMillis();
		// fim da parte a desconsiderar
		int ack_return = ackermann(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println("Resultado: " + ack_return);
		// não considerar essa lógica para o programa
		System.out.printf("Tempo decorrido: %d ms\n", System.currentTimeMillis() - tempoInicial);
		// fim da parte a desconsiderar
	}
	static int ackermann(int m, int n) {
		if (m == 0)
			return n + 1;
		else if (m > 0 && n == 0)
			return ackermann(m - 1, 1);
		else if (m > 0 && n > 0)
			return ackermann(m - 1, ackermann(m, n - 1));

		return 0;
	}
}
