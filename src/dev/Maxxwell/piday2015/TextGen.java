package dev.Maxxwell.piday2015;

public class TextGen {
	public String[] gen(int n) {
		String anum = getAnum(n);
		
		return genStrings(anum);
	}
	
	private String getAnum(int n) {
		String anum = "";
		
		if (n < 10) {
			anum = "0" + anum;
		}
		
		return anum;
	}
	
	private String[] genStrings(String anum) {
		char[] chars = anum.toCharArray();
		String[] ret = new String[22];
		String[] c1 = new Database().getNumber(Integer.parseInt("" + chars[0]));
		String[] c2 = new Database().getNumber(Integer.parseInt("" + chars[1]));
		for (int i = 0; i < c1.length; i++) {
			ret[i] = c1[i];
		}
		
		for (int i = 0; i < c2.length; i++) {
			ret[i + 11] = c2[i];
		}
		
		return ret;
	}
}
