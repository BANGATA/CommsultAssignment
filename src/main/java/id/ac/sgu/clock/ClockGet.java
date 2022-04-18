package id.ac.sgu.clock;

public abstract class ClockGet implements Clock{
	protected int time = 0;
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
}
