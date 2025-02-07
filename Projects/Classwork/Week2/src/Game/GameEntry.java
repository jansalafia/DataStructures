package Game;

public class GameEntry {

	private String name;
	private int score;
	
	public GameEntry(String n, int s) {
		name = n;
		score = s;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return name + " " + score;
	}
	
}
