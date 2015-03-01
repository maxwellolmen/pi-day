package dev.Maxxwell.piday2015;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calculate extends Thread {
	private Display d;
	
	public Calculate(Display d) {
		this.d = d;
	}
	
	public void run() {
		boolean running = true;
		while (running) {
			int su = secondsDistance();
			System.out.println("Confirmed " + su + " seconds until destination date.");
			
			int[] times = getTimes(su);
			
			d.setDays(times[0]);
			d.setHours(times[1]);
			d.setMinutes(times[2]);
			d.setSeconds(times[3]);
			
			System.out.println("Confirmed " + times[0] + " days, " + times[1] + " hours, " + times[2] + " minutes, and " + times[3] + " seconds.");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Slept for one second while looping through the countdown calculator.");
			
			if (times[0] == 0 && times[1] == 0 && times[2] == 0 && times[3] == 1) {
				d.setVisible(false);
				new Celebrate();
				running = false;
			}
		}
	}
	
	public int secondsDistance() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		Date dt = new Date();
		
		String when = dateFormat.format(dt);
		String date = when.split(" ")[0];
		String time = when.split(" ")[1];
		
		String year = date.split("/")[0];
		String month = date.split("/")[1];
		String day = date.split("/")[2];
		
		String hour = time.split(":")[0];
		String minute = time.split(":")[1];
		String second = time.split(":")[2];
		
		int monthdistance = 0;
		int daydistance = 0;
		int hourdistance = 0;
		int minutedistance = 0;
		int seconddistance = 0;
		
		if (!month.equals(d.getMonth())) {
			if (month.toCharArray()[0] == '0') {
				month = "" + month.toCharArray()[1];
			}
			
			int m = 0;
			
			if (d.getMonth().toCharArray()[0] == '0') {
				m = Integer.parseInt("" + d.getMonth().toCharArray()[1]);
			}
			else {
				m = Integer.parseInt(d.getMonth());
			}
			
			if (Integer.parseInt(month) > 3) {
				monthdistance = (12 - Integer.parseInt(month) + m);
			}
			else {
				monthdistance = m - Integer.parseInt(month);
			}
		}
		
		if (!day.equals(d.getDay())) {
			if (day.toCharArray()[0] == '0') {
				day = "" + day.toCharArray()[1];
			}
			
			int dy = 0;
			
			if (d.getDay().toCharArray()[0] == '0') {
				dy = Integer.parseInt("" + d.getDay().toCharArray()[1]);
			}
			else {
				dy = Integer.parseInt(d.getDay());
			}
			
			daydistance = dy - Integer.parseInt(day);
		}
		
		if (!hour.equals(d.getHour())) {
			if (hour.toCharArray()[0] == '0') {
				hour = "" + hour.toCharArray()[1];
			}
			
			int h = 0;
			
			if (d.getHour().toCharArray()[0] == '0') {
				h = Integer.parseInt("" + d.getHour().toCharArray()[1]);
			}
			else {
				h = Integer.parseInt(d.getHour());
			}
			
			hourdistance = h - Integer.parseInt(hour);
		}
		
		if (!minute.equals(d.getMinute())) {
			if (minute.toCharArray()[0] == '0') {
				minute = "" + minute.toCharArray()[1];
			}
			
			int m = 0;
			
			if (d.getMinute().toCharArray()[0] == '0') {
				m = Integer.parseInt("" + d.getMinute().toCharArray()[1]);
			}
			else {
				m = Integer.parseInt(d.getMinute());
			}
			
			minutedistance = m - Integer.parseInt(minute);
		}
		
		if (!second.equals(d.getSecond())) {
			if (second.toCharArray()[0] == '0') {
				second = "" + second.toCharArray()[1];
			}
			
			int s = 0;
			
			if (d.getSecond().toCharArray()[0] == '0') {
				s = Integer.parseInt("" + d.getSecond().toCharArray()[1]);
			}
			else {
				s = Integer.parseInt(d.getSecond());
			}
			
			seconddistance = s - Integer.parseInt(second);
		}
		
		monthdistance*=(new Database().getDaysInMonth(Integer.parseInt(month), Integer.parseInt(year)) * 86400);
		daydistance*=86400;
		hourdistance*=3600;
		minutedistance*=60;
		
		int distance = monthdistance + daydistance + hourdistance + minutedistance + seconddistance;
		
		return distance;
	}
	
	public int[] getTimes(int seconds) {
		int[] times = new int[4];
		
		int days = -1;
		for (int i = 0; i * 86400 < seconds; i++) {
			days++;
		}
		
		seconds-=(days * 86400);
		
		int hours = -1;
		for (int i = 0; i * 3600 < seconds; i++) {
			hours++;
		}
		
		seconds-=(hours * 3600);
		
		int minutes = -1;
		for (int i = 0; i * 60 < seconds; i++) {
			minutes++;
		}
		
		seconds-=(minutes * 60);
		
		if (seconds == 60) {
			seconds = 0;
			if (minutes != 0) {
				minutes++;
			}
			else{
				if (hours != 0) {
					hours++;
					minutes++;
				}
			}
		}
		
		times[0] = days;
		times[1] = hours;
		times[2] = minutes;
		times[3] = seconds;
		
		return times;
	}
}
