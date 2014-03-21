package gameentry;

/* teste */
public class GameEntry {
	private String name;
	protected int score;

	public GameEntry(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "(" + this.name + ", " + this.score + ")";
	}
}
