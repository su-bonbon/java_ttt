package finalPhase1;

public class ComputerPlayer extends APlayer{
	private String name;
	private String mark;
	
	public ComputerPlayer(String name, String mark) {
		super(name, mark);
	}
	
//	private int randomNumber(int range) { 
//		return (int) (Math.random() * range);
//	}
	
	public int randomNumber(int num1) {
		int randNum = (int)Math.round(num1 * Math.random());
		return randNum;
	}
	
	public int selectRowValue(int range) {
		return this.randomNumber(range);
	}
	
	public int selectColValue(int range) {
		return this.randomNumber(range);
	}
}
