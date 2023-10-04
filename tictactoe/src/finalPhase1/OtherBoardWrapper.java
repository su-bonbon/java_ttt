package finalPhase1;

public class OtherBoardWrapper implements Iboard {
	
	OtherBoard otherBoard = new OtherBoard();
	
	public void print() {
		otherBoard.printMyBoard();
	}
	
	public String getMark(int row, int col) {
		return otherBoard.getMark(row, col);
	}
	
	public boolean makeMove(String mark, int row, int col) {
		return otherBoard.setMark(row, col, mark);
	}
	
	public void setSize(int row, int col) {
		otherBoard.setSize(row, col);
	}
	
	public int getBoardRowSize() {
		return otherBoard.getRowSize();
	}
	
	public int getBoardColSize() {
		return otherBoard.getColSize();
	}
	
	public String getName() {
		return otherBoard.getName();
	}
	
	public boolean isFull() {
		return (otherBoard.emptyCells().length==0);
	}
}
