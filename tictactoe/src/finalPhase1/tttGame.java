package finalPhase1;

public class tttGame {

	private HumanPlayer[] players = new HumanPlayer[2];
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
			HumanPlayer hp = new HumanPlayer("player" + i+1, marks[i]); 
			players[i] = hp;
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
		if(isWinner()) {
			System.out.println(this.marks[this.currentPlayerIndex] + " is Winner!");
			return true;
		} else if(board.isFull()) {
			System.out.println("TIE");
			return true
		}
		return false;
	}

	private boolean isWinner() {
		if(checkRows()) {
			return true;
		} else if(checkCols()) {
			return true;
		} else if(checkDiagLR()) {
			return true;
		} else if(checkDiagRL()) {
			return true;
		} else {
		return false;
		}
	}

	private boolean checkDiagRL() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean checkDiagLR() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean checkCols() {
		for(int col = 0; col < this.gameColSize; col++) {
			if(checkCol(col)) return true;
		}
		return false;
	}

	private boolean checkCol(int col) {
		int count = 0;
		for(int row = 0; row < this.gameRowSize; row++) {
			if(board.getMark(row, col).equals(players[currentPlayerIndex].getMark())) {
				count++;
			}
		}
		if(count == this.gameScoreToWin) {
			return true;
		}
		return false;
	}

	private boolean checkRows() {
		for(int row = 0; row < this.gameRowSize; row++) {
			if(checkRow(row)) {
				return true;
			}
		}
		return false;
	}

	private boolean checkRow(int row) {
		int count = 0;
		for(int col = 0; col < this.gameColSize; col++) {
			if(board.getMark(row, col).equals(players[currentPlayerIndex].getMark())) {
				count++;
			}
		}
		if(count == this.gameScoreToWin) {
			return true;
		}
		return false;
	}

	private void switchPlayer() {
		if(this.currentPlayerIndex == -1 || this.currentPlayerIndex == 1) {
			this.currentPlayerIndex = 0;
		} else {
			currentPlayerIndex = 1;
		}
	}

	private void print() {
		this.board.print();
	}
}
