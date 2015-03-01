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
		while (true) {
			int su = secondsDistance();
			
			int[] times = getTimes(su);
			
			d.setDays(times[0]);
			d.setHours(times[1]);
			d.setMinutes(times[2]);
			d.setSeconds(times[3]);
		}
	}
	
	public int secondsDistance() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		Date d = new Date();
		
		String when = dateFormat.format(d);
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
		
		if (!month.equals("03")) {
			if (month.toCharArray()[0] == '0') {
				month = "" + month.toCharArray()[1];
			}
			
			if (Integer.parseInt(month) > 3) {
				monthdistance = (12 - Integer.parseInt(month) + 3);
			}
			else {
				monthdistance = 3 - Integer.parseInt(month);
			}
		}
		
		if (!day.equals("14")) {
			if (day.toCharArray()[0] == '0') {
				day = "" + day.toCharArray()[1];
			}
			
			daydistance = 14 - Integer.parseInt(day);
		}
		
		if (!hour.equals("09")) {
			if (hour.toCharArray()[0] == '0') {
				hour = "" + hour.toCharArray()[1];
			}
			
			hourdistance = 9 - Integer.parseInt(hour);
		}
		
		if (!minute.equals("26")) {
			if (minute.toCharArray()[0] == '0') {
				minute = "" + minute.toCharArray()[1];
			}
			
			minutedistance = 26 - Integer.parseInt(minute);
		}
		
		if (!second.equals("53")) {
			if (second.toCharArray()[0] == '0') {
				second = "" + second.toCharArray()[1];
			}
			
			seconddistance = 53 - Integer.parseInt(second);
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
		
		times[0] = days;
		times[1] = hours;
		times[2] = minutes;
		times[3] = seconds;
		
		return times;
	}
}
