package br.univille.aula1.arranjos;

public class Main {

	public static void main(String[] args) {

		StringBuilder name = new StringBuilder();

		Scores scores = new Scores();

		for (int j = 0; j < 20; j++) {
			name.delete(0, name.length());

			for (int i = 0; i < 3; i++)
				name.append((char) (Math.random() * 25 + 65));

			scores.add(new GameEntry(name.toString(),
					(int) (Math.random() * 200)));
		}

		System.out.println(scores.toString());

	}

}
