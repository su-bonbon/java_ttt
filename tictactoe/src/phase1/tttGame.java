package phase1;

public class tttGame {

	private Player[] players = new Player[2];
	private Board board;
	private String[] marks = {"X", "O"};
	private String name = "TicTacToe";
	private int currentPlayerIndex = -1;
	private int gameRowSize;
	private int gameColSize;
	
	public tttGame() {
		setPlayer();
		setBoard();
	}

	private void setPlayer() {
		for(int i  = 0; i < players.length; i++) {
			players[i] = new Player("player1" + i + 1, marks[i]);
		}
		
	}

	private void setBoard() {
		this.board = new Board();
	}
	
	/**
	 * 1- start the game
	 * 2- select the player
	 * 3- make move
	 * 4- board validate the move
	 * 5- stopping rule
	 */
	public void start() {
		System.out.println("game started...");
		do {
			switchPlayer();
			while(!this.board.makeMove(players[currentPlayerIndex].getMark(), 
					players[currentPlayerIndex].randomNumber(gameRowSize), 
					players[currentPlayerIndex].randomNumber(gameColSize)) {
				//make move
			}
		}while(!gameover());
		print();
	}
	
	private boolean gameover() {
		// TODO Auto-generated method stub
		return false;
	}

	private void switchPlayer() {
		// TODO Auto-generated method stub
		
	}

	private void print() {
		this.board.print();
	}
}
