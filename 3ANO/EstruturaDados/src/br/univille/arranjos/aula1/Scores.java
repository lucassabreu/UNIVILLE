package br.univille.arranjos.aula1;

public class Scores {
	public static final int maxEntries = 10;
	protected int numEntries;
	protected GameEntry[] entries;

	public Scores() {
		entries = new GameEntry[maxEntries];
		numEntries = 0;
	}

	public void add(GameEntry e) {
		int newScore = e.getScore();

		if (this.numEntries == maxEntries) {
			if (newScore <= this.entries[this.numEntries - 1].getScore())
				return;
		} else
			this.numEntries++;

		int i = this.numEntries - 1;

		for (; (i >= 1) && (newScore > entries[i - 1].getScore()); i--)
			this.entries[i] = entries[i - 1];
		
		entries[i] = e;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append('[');

		for (int i = 0; i < numEntries; i++) {
			if (i > 0)
				sb.append(", ");
			sb.append(entries[i]);
		}

		sb.append(']');

		return sb.toString();
	}
}
