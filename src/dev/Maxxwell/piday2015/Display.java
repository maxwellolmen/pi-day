package dev.Maxxwell.piday2015;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Display extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JTextArea days = new JTextArea(9, 15);
	private JTextArea hours = new JTextArea(9, 15);
	private JTextArea minutes = new JTextArea(9, 15);
	private JTextArea seconds = new JTextArea(9, 15);
	private JTextArea colon1 = new JTextArea(2, 1);
	private JTextArea colon2 = new JTextArea(2, 1);
	private JTextArea colon3 = new JTextArea(2, 1);
	
	private static String month = "03";
	private static String day = "14";
	private static String hour = "09";
	private static String minute = "26";
	private static String second = "53";
	
	public Display() {
		super("Centennial Pi Day Countdown");
		String month = JOptionPane.showInputDialog(null, "Please type in the number value of the destination month.");
		String day = JOptionPane.showInputDialog(null, "Please type in the number value of the destination day.");
		String hour = JOptionPane.showInputDialog(null, "Please type in the number value of the destination hour.");
		String minute = JOptionPane.showInputDialog(null, "Please type in the number value of the destination minute.");
		String second = JOptionPane.showInputDialog(null, "Please type in the number value of the destination second.");
		
		if (month.toCharArray().length < 2) {
			month = "0" + month;
		}
		
		if (day.toCharArray().length < 2) {
			day = "0" + day;
		}
		
		if (hour.toCharArray().length < 2) {
			hour = "0" + hour;
		}
		
		if (minute.toCharArray().length < 2) {
			minute = "0" + minute;
		}
		
		if (second.toCharArray().length < 2) {
			second = "0" + second;
		}
		
		if (month.toCharArray().length == 2 && day.toCharArray().length == 2 && hour.toCharArray().length == 2 && minute.toCharArray().length == 2 && second.toCharArray().length == 2) {
			String[] times = {month, day, hour, minute, second};
			System.out.println(month);
			System.out.println(day);
			System.out.println(hour);
			System.out.println(minute);
			System.out.println(second);
			setDestination(times);
		}
		System.out.println("Loading interface settings...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1300, 232);
		setResizable(false);
		setLayout(new FlowLayout());
		setVisible(true);
		Container cp = getContentPane();
		days.setEditable(false);
		days.setFont(new Font("Courier", Font.PLAIN, 11));
		hours.setEditable(false);
		hours.setFont(new Font("Courier", Font.PLAIN, 11));
		minutes.setEditable(false);
		minutes.setFont(new Font("Courier", Font.PLAIN, 11));
		seconds.setEditable(false);
		seconds.setFont(new Font("Courier", Font.PLAIN, 11));
		colon1.setEditable(false);
		colon1.setFont(new Font("Courier", Font.BOLD, 40));
		colon2.setEditable(false);
		colon2.setFont(new Font("Courier", Font.BOLD, 40));
		colon3.setEditable(false);
		colon3.setFont(new Font("Courier", Font.BOLD, 40));
		cp.add(days);
		cp.add(colon1);
		cp.add(hours);
		cp.add(colon2);
		cp.add(minutes);
		cp.add(colon3);
		cp.add(seconds);
		colon1.setText("O\n \nO");
		colon2.setText("O\n \nO");
		colon3.setText("O\n \nO");
		System.out.println("Starting countdown calculator...");
		Calculate c = new Calculate(this);
		c.start();
	}
	
	public void setDays(int days) {
		String[] show = new TextGen().gen(days);
		
		String display = "";
		
		for (int i = 0; i < 11; i++) {
			display+=show[i] + "  " + show[i + 11] + "\n";
		}
		
		this.days.setText(display);
	}
	
	public void setHours(int hours) {
		String[] show = new TextGen().gen(hours);
		
		String display = "";
		
		for (int i = 0; i < 11; i++) {
			display+=show[i] + "  " + show[i + 11] + "\n";
		}
		
		this.hours.setText(display);
	}
	
	public void setMinutes(int minutes) {
		String[] show = new TextGen().gen(minutes);
		
		String display = "";
		
		for (int i = 0; i < 11; i++) {
			display+=show[i] + "  " + show[i + 11] + "\n";
		}
		
		this.minutes.setText(display);
	}
	
	public void setSeconds(int seconds) {
		String[] show = new TextGen().gen(seconds);
		
		String display = "";
		
		for (int i = 0; i < 11; i++) {
			display+=show[i] + "  " + show[i + 11] + "\n";
		}
		
		this.seconds.setText(display);
	}
	
	public String getMonth() {
		return month;
	}
	
	public String getDay() {
		return day;
	}
	
	public String getHour() {
		return hour;
	}
	
	public String getMinute() {
		return minute;
	}
	
	public String getSecond() {
		return second;
	}
	
	public void setDestination(String[] times) {
		if (times.length == 5) {
			month = times[0];
			day = times[1];
			hour = times[2];
			minute = times[3];
			second = times[4];
		}
	}
}
