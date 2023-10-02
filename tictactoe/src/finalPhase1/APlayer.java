package finalPhase1;

public abstract class APlayer {

	private String name;
	private String mark;
	
	APlayer(){
		
	}

	APlayer(String name, String mark){
		
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getMark() {
		return mark;
	}

	void setMark(String mark) {
		this.mark = mark;
	}
	
	abstract int selectRowValue(int range);
	abstract int selectColValue(int range);
//	public int randomNumber(int num1) {
//		int randNum = (int)Math.round(num1 * Math.random());
//		return randNum;
//	}
}
