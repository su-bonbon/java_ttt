package finalPhase1;

public abstract class APlayer {

	private String name;
	private String mark;
	
	APlayer(){
		
	}

	public APlayer(String name, String mark){
		this.setName(name);
		this.setMark(mark);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}
	
	abstract int selectRowValue(int range);
	abstract int selectColValue(int range);
	
//	public int randomNumber(int num1) {
//		int randNum = (int)Math.round(num1 * Math.random());
//		return randNum;
//	}
}
