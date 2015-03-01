package dev.Maxxwell.piday2015;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Display extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JTextArea days = new JTextArea(11, 42);
	private JTextArea hours = new JTextArea(11, 42);
	private JTextArea minutes = new JTextArea(11, 42);
	private JTextArea seconds = new JTextArea(11, 42);
	
	public Display() {
		super("Centennial Pi Day Countdown");
		System.out.println("Loading interface settings...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setResizable(false);
		setLayout(new FlowLayout());
		setVisible(true);
		Container cp = getContentPane();
		cp.add(days);
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
}
