package id.ac.sgu.wind;

public abstract class WindGet implements Wind {
	protected int windSpeed;
	
	public int getWindSpeed() {
		return windSpeed;
	}
	
	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}
}