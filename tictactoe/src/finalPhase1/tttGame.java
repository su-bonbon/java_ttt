package finalPhase1;

public class tttGame {

	private APlayer[] players = new APlayer[2];
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
			players[i] = new HumanPlayer();
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
					players[currentPlayerIndex].randomNumber(gameColSize))) {
				print();
			}
		}while(!gameover());
		print();
	}
	
	private boolean gameover() {
		if (this.board.isFull() || this.board.checkWin(players[currentPlayerIndex].getMark())) { 
			return true;
		} else {
				 
			return false;
		}
	}

	private void switchPlayer() {
		if(currentPlayerIndex<2) {
			currentPlayerIndex++;
		} else {
			currentPlayerIndex = 0;
		}
	}

	private void print() {
		this.board.print();
	}
}
