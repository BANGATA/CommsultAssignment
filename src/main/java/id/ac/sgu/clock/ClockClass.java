package id.ac.sgu.clock;

public class ClockClass extends ClockGet{
	@Override
	public void waktu() {
		if(time == 24) {
			time = 0;
		}
		System.out.println("Current Time: " + time + ":00");
		time++;
	};
}
