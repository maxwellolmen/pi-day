package dev.Maxxwell.piday2015;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Celebrate extends JFrame {
	private static final long serialVersionUID = 1L;

	private JTextArea jta = new JTextArea();
	
	public Celebrate() {
		super("HAPPY CENTENNIAL PI DAY!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1300, 232);
		setResizable(false);
		setLayout(new FlowLayout());
		setVisible(true);
		Container cp = getContentPane();
		jta.setEditable(false);
		jta.setFont(new Font("Courier", Font.PLAIN, 11));
		cp.add(jta);
		CelebCalc calc = new CelebCalc(this);
		calc.start();
	}
	
	public void setText(String[] text) {
		String txt = "";
		for (int i = 0; i < text.length; i++) {
			txt+=text[i];
		}
		jta.setText(txt);
	}
}
