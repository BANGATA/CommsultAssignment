package id.ac.sgu.home;

import java.util.Random;

import id.ac.sgu.clock.*;
import id.ac.sgu.temp.*;
import id.ac.sgu.wind.*;

public class HomeApp {
	static int x, y;
	static Random rng = new Random();
	public static void main(String[] args) throws InterruptedException {
		Wind winds = new WSclass();
		Temp tmp = new TempClass();
		Clock wkt = new ClockClass();
		for(;;) {
			int time = wkt.getTime();
			wkt.waktu();
			x = rng.nextInt(100);
			y = rng.nextInt(30);
			winds.setWindSpeed(x);
			winds.WS();
			tmp.setTemp(y);
			tmp.Tempt();
			if(time >= 22 || time <= 6 || x >= 50) {
				System.out.println("Blends: Close");
			} else {
				System.out.println("Blends: Open");
			}
			if(x >= 50 || y <= 20) {
				System.out.println("Heater: On");
			} else {
				System.out.println("Heater: Off");
			}
			System.out.println();
			Thread.sleep(1000);
		}
	}
}