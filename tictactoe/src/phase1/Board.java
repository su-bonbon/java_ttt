package phase1;

public class Board {

	private Box[] boxes;
	private String name;
	private int boardRowSize;
	private int boardColSize;
	
	Board() {
		this(3, 3, "3*3 Board");
	}
	Board(int boardRowSize, int boardColSize, String name) {
		this.setName(name);
		this.setSize(boardRowSize, boardColSize);
		init();
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	private void setSize(int row, int col) {
		this.boardRowSize = row;
		this.boardColSize = col;
	}
	
	void init() {
		Box[] boxes = new Box[this.boardRowSize * boardColSize];
		for(int i = 0; i < boxes.length; i++) {
			Box b = new Box(i/boardRowSize, i%boardColSize);
			boxes[i] = b;
		}
	}
	
	void print() {
		for(int i = 0; i < boxes.length; i++) {
			if(i!=0 && i%boardRowSize == 0)  System.out.println();
			boxes[i].print();
		}
	}
	boolean makeMove(String mark, int row, int col) {
		if (row < 0 || row >= 3 || col < 0 || col >= 3 || !boxes[row*3+col].equals(Box.DASH)) {
            System.out.println("Invalid move. Please try again.");
            return false;
        } else {
        	return true;
        }
	}
}
