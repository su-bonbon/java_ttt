package finalPhase1;

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
	
	String getMark(int row, int col) {
		return this.boxes[row*3+col].getPlaceHolder();
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
		return boxes[row * this.boardRowSize + col].setPlaceHolder(mark);
	}
	
	boolean isFull() {
        for(Box b : boxes) {
        	if(b.isAvailable()) {
        		return false;
        	}
        }
        return true;
    }
	
	boolean checkWin(String mark) {
           if (boxes[0].getPlaceHolder().equals(mark) && boxes[1].getPlaceHolder().equals(mark) && boxes[2].getPlaceHolder().equals(mark) ||
        	   boxes[3].getPlaceHolder().equals(mark) && boxes[4].getPlaceHolder().equals(mark) && boxes[5].getPlaceHolder().equals(mark) ||
        	   boxes[6].getPlaceHolder().equals(mark) && boxes[7].getPlaceHolder().equals(mark) && boxes[8].getPlaceHolder().equals(mark) ||
        	   boxes[0].getPlaceHolder().equals(mark) && boxes[4].getPlaceHolder().equals(mark) && boxes[7].getPlaceHolder().equals(mark) ||
        	   boxes[2].getPlaceHolder().equals(mark) && boxes[4].getPlaceHolder().equals(mark) && boxes[6].getPlaceHolder().equals(mark)) {
                return true;  // Mark has won in this row
           } else {
        	   return false;
           }
    }

    
}
