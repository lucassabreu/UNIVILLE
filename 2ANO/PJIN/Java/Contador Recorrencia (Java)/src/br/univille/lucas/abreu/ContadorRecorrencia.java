package br.univille.lucas.abreu;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ContadorRecorrencia {
	public static void main(String[] args) throws Exception {
		// não considerar essa lógica para o programa
		long tempoInicial = System.currentTimeMillis();
		// fim da parte a desconsiderar
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		StringBuffer sbTexto = new StringBuffer();
		String texto = null, word = null;
		int contador = 0;
		while (br.ready())
			sbTexto.append(br.readLine() + "\n");
		br.close();
		texto = "," + Pattern.compile("\\W+").matcher(sbTexto).replaceAll(",").toLowerCase();
		Pattern nextWordPattern = Pattern.compile("(\\w+)");
		Pattern wordPattern = null;
		Matcher m = null;
		m = nextWordPattern.matcher(texto);
		while (m.find()) {
			word = m.group();
			wordPattern = Pattern.compile("\\W+(" + word + ")\\W+");
			m = wordPattern.matcher(texto);
			contador = 0;
			do {
				while (m.find())
					contador++;
				texto = m.replaceAll(",");
				m = wordPattern.matcher(texto);
			} while (m.find());
			System.out.println(word + " - " + contador);
			m = nextWordPattern.matcher(texto);
		}
		// não considerar essa lógica para o programa
		System.out.printf("Tempo decorrido: %d ms\n", System.currentTimeMillis() - tempoInicial);
		// fim da parte a desconsiderar
	}
}
