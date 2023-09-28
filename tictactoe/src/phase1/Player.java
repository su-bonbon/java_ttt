package phase1;

public class Player {

	private String name;
	private String mark;
	
	Player(String name, String mark){
		
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

	int randomNumber(int num1) {
		int randNum = (int)Math.round(num1 * Math.random());
		return randNum;
	}
}
