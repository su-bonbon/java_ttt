package phase1;

public class Box {
	private int row;
	private int col;
	private String placeHolder = Box.DASH;
	public final static String DASH = "-";
	
	Box(int row, int col){
		this.row = row;
		this.col = col;
	}

	String getPlaceHolder() {
		return placeHolder;
	}

	boolean setPlaceHolder(String placeHolder) {
		if(isAvailable()) {
			this.placeHolder = placeHolder;
			return true;
		}
		return false;
	}
	
	boolean isAvailable() {
		return this.placeHolder.equals(Box.DASH);
	}
	
	void print() {
		System.out.print(this.placeHolder + " ");
	}
	
	
	
}
