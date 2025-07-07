package sANDl;

public class MainClass {

	public static void main(String[] args) {
	 Players p1 = new Players("p1", 0);
	 Players p2 = new Players("p2", 0);
	 
	 Game game = new Game(100, p1, p2);
	 
	 game.startGame(game, 100);
	 return ;
	
	}	 
}
