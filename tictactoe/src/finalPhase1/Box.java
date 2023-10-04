package finalPhase1;

public class Box {
	private int row;
	private int col;
	private String placeHolder = Box.DASH;
	public final static String DASH = "-";
	
	public Box(int row, int col){
		this.row = row;
		this.col = col;
		this.placeHolder = DASH;
	}

	public String getPlaceHolder() {
		return placeHolder;
	}

	public boolean setPlaceHolder(String placeHolder) {
		if(isAvailable()) {
			this.placeHolder = placeHolder;
			return true;
		}
		return false;
	}
	
	public boolean isAvailable() {
		return this.placeHolder.equals(Box.DASH);
	}
	
	public void print() {
		System.out.print(this.placeHolder + " ");
	}
	
	
	
}
