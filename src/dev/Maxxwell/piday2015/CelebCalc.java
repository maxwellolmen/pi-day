package dev.Maxxwell.piday2015;

public class CelebCalc extends Thread {
	private Celebrate c;
	
	public CelebCalc(Celebrate c) {
		this.c = c;
	}
	
	public void run() {
		while (true) {
			for (int i = 0; i < 16; i++) {
				String[] fw = new Database().getFirework(i);
				String[] pi = new Database().getPi();
				
				String l1 = fw[0] + "                   " + fw[0];
				String l2 = fw[1] + "  " + pi[0] + "  " + fw[1];
				String l3 = fw[2] + "  " + pi[1] + "  " + fw[2];
				String l4 = fw[3] + "  " + pi[2] + "  " + fw[3];
				String l5 = fw[4] + "  " + pi[3] + "  " + fw[4];
				String l6 = fw[5] + "  " + pi[4] + "  " + fw[5];
				
				String[] display = {l1, l2, l3, l4, l5, l6};
				
				c.setText(display);
			}
		}
	}
}
