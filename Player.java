import java.awt.Color;

public class Player {

	private String name;
	private int score;
	private Color playerColor = Color.BLUE;
	
	public Player(String name){
		this.name = name;
	}
	
	public String getPlayerName(){
		return name;
	}
	
	public int getScore(){
		return score;
	}
	
	public void updateScore(int score){
		this.score = score;
	}
	
	public String toString(){
		return "Player Name: "+name+"\nScore: "+score;
	}
}
