package sANDl;


public class Game {

	Board board;
	Players[] players;
	Players currentPlayer;
	
	public Board getBoard() {
		return board;
	}
	
	public Game(int size, Players p1, Players p2) {
		super();
		this.board = new Board(size);
		this.players = new Players[] {p1,p2};
		this.currentPlayer = p1;
	}
	
	public void setBoard(Board board) {
		this.board = board;
	}
	public Players[] getPlayers() {
		return players;
	}
	public void setPlayers(Players[] players) {
		this.players = players;
	}
	public Players getCurrentPlayer() {
		return currentPlayer;
	}
	public void setCurrentPlayer(Players currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	
	public void startGame(Game game, int size) {
		
		while(!(game.currentPlayer.posNum==size)) {
			
			System.out.println("player "  + game.currentPlayer.name + " : " + "Roll the  Dice");
		    
			int num = Dice.randomNum();
			
			System.out.println("num is :: " + num);
			
            if((game.currentPlayer.posNum+num)>100);
            
            else if((game.currentPlayer.posNum+num)==100) {
            	System.out.println(" winner is :: " + game.currentPlayer.name);
            	return;
            }
            
            else {
            	int newPos = board.updatedPos(game.currentPlayer.posNum+num);
            	System.out.println("newPos is :: " + newPos);
            	game.currentPlayer.posNum = newPos;
            	game.currentPlayer = game.currentPlayer.name.equals(game.players[0].name)?game.players[1]:game.players[0];
            	
            	System.out.println("new player "  + game.currentPlayer.name);
            }
            
			
		}
		
	}

}
