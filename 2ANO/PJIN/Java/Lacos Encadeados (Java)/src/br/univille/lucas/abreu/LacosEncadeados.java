package br.univille.lucas.abreu;
public class LacosEncadeados {
	public static void main(String[] args) {
		// não considerar essa lógica para o programa
		long tempoInicial = System.currentTimeMillis();
		// fim da parte a desconsiderar
		int indice = Integer.parseInt(args[0]);
		int i[] = new int[6], soma = 0;
		for (i[0] = 0; i[0]<indice;i[0]++)
			for (i[1] = 0; i[1]<indice;i[1]++)
				for (i[2] = 0; i[2]<indice;i[2]++)
					for (i[3] = 0; i[3]<indice;i[3]++)
						for (i[4] = 0; i[4]<indice;i[4]++)
							for (i[5] = 0; i[5]<indice;i[5]++)
								soma++;
		System.out.println("Resultado: " + soma);
		// não considerar essa lógica para o programa
		System.out.printf("Tempo decorrido: %d ms\n", System.currentTimeMillis() - tempoInicial);
		// fim da parte a desconsiderar
	}

}
