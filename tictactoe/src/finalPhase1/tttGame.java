package finalPhase1;

public class tttGame {

	private APlayer[] players = new APlayer[2];
	private Iboard board;
	private String[] marks = {"X", "O"};
	private String name = "TicTacToe";
	private int currentPlayerIndex = -1;
	private int gameRowSize = 3;
	private int gameColSize = 3;
	private int gameScoreToWin = 3;
	
	public tttGame() {
		setPlayer();
		setBoard();
	}

	private void setPlayer() {
		for(int i  = 0; i < players.length; i++) {
			ComputerPlayer cp = new ComputerPlayer("player" + i+1, marks[i]); 
			players[i] = cp;
		}
		
	}

	private void setBoard() {
		this.board = new Board();
	}
	public void setBoard(Iboard board) {
		this.board = board;
	}
	public void setPlayer(APlayer player1, APlayer player2) {
		players[0] = player1;
		players[1] = player2;
	}
	
	/**
	 * 1- start the game
	 * 2- select the player
	 * 3- make move
	 * 4- board validate the move
	 * 5- stopping rule
	 */
	public void start() {
		System.out.println("\ngame started...");
		do {
			switchPlayer();
			while(!this.board.makeMove(players[currentPlayerIndex].getMark(), 
					players[currentPlayerIndex].selectRowValue(gameRowSize), 
					players[currentPlayerIndex].selectColValue(gameColSize))) {
				System.out.println();
				print();
			}
		}while(!gameover());
		print();
	}
	
	private boolean gameover() {
		if(isWinner()) {
			System.out.println("\n" +this.marks[this.currentPlayerIndex] + " is Winner!");
			return true;
		} else if(board.isFull()) {
			System.out.println("\nTIE");
			return true;
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
		int count = 0;
		for(int row = 0, col = 0; col < this.gameColSize && row < this.gameRowSize; row++, col++) {
			if(board.getMark(row, col).equals(players[currentPlayerIndex].getMark())) {
				count++;
			}
		}
		if(count == this.gameScoreToWin) {
			return true;
		}
		return false;
	}

	private boolean checkDiagLR() {
		int count = 0;
		for(int row = 0, col = (this.gameRowSize - 1); row < this.gameColSize && col >= 0; row++, col--) {
			if(board.getMark(row, col).equals(players[currentPlayerIndex].getMark())) {
				count++;
			}
		}
		if(count == this.gameScoreToWin) {
			return true;
		}
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
