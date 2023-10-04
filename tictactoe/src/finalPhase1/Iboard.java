package finalPhase1;

public interface Iboard {
	void print();
	String getMark(int row, int col);
	boolean makeMove(String mark, int row, int col);
	void setSize(int row, int col);
	public int getBoardRowSize();
	public int getBoardColSize();
	String getName();
	boolean isFull();
}