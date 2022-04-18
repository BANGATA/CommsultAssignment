package id.ac.sgu.temp;

public abstract class TempGet implements Temp{
	protected int temp;
	
	public int getTemp() {
		return temp;
	}
	
	public void setTemp(int temp) {
		this.temp = temp;
	}
}
