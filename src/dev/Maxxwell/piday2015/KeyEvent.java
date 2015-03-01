package dev.Maxxwell.piday2015;

import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

public class KeyEvent implements KeyListener {
	private Display d;
	
	public KeyEvent(Display d) {
		this.d = d;
	}
	
	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
		if (e.getKeyChar() == 't') {
			String month = JOptionPane.showInputDialog(null, "Please type in the number value of the destination month.");
			String day = JOptionPane.showInputDialog(null, "Please type in the number value of the destination day.");
			String hour = JOptionPane.showInputDialog(null, "Please type in the number value of the destination hour.");
			String minute = JOptionPane.showInputDialog(null, "Please type in the number value of the destination minute.");
			String second = JOptionPane.showInputDialog(null, "Please type in the number value of the destination second.");
			
			if (month.toCharArray().length < 2) {
				month = " " + month;
			}
			
			if (day.toCharArray().length < 2) {
				day = " " + day;
			}
			
			if (hour.toCharArray().length < 2) {
				hour = " " + hour;
			}
			
			if (minute.toCharArray().length < 2) {
				minute = " " + minute;
			}
			
			if (second.toCharArray().length < 2) {
				second = " " + second;
			}
			
			if (month.toCharArray().length == 2 && day.toCharArray().length == 2 && hour.toCharArray().length == 2 && minute.toCharArray().length == 2 && second.toCharArray().length == 2) {
				String[] times = {month, day, hour, minute, second};
				d.setDestination(times);
			}
		}
	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
		
	}
}
