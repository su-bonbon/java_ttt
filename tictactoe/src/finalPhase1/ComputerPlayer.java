package finalPhase1;

public class ComputerPlayer {
	private String name;
	private String mark;
	
	public ComputerPlayer(String name, String mark) {
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
	
	public int randomNumber(int range) {
		return (int) (Math.random() * range);
	}
}
