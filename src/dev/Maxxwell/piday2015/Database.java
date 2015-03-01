package dev.Maxxwell.piday2015;

public class Database {
	public String[] getNumber(int num) {
		switch (num) {
		case 0:
			String[] zero = {" .----------------. ", "| .--------------. |", "| |     ____     | |", "| |   .'    '.   | |", "| |  |  .--.  |  | |", "| |  | |    | |  | |", "| |  |  `--'  |  | |", "| |   '.____.'   | |", "| |              | |", "| '--------------' |", " '----------------' "};
			return zero;
		case 1:
			String[] one = {" .----------------. ", "| .--------------. |", "| |     __       | |", "| |    /  |      | |", "| |    `| |      | |", "| |     | |      | |", "| |    _| |_     | |", "| |   |_____|    | |", "| |              | |", "| '--------------' |", " '----------------' "};
			return one;
		case 2:
			String[] two = {" .----------------. ", "| .--------------. |", "| |    _____     | |", "| |   / ___ `.   | |", "| |  |_/___) |   | |", "| |   .'____.'   | |", "| |  / /____     | |", "| |  |_______|   | |", "| |              | |", "| '--------------' |", " '----------------' "};
			return two;
		case 3:
			String[] three = {" .----------------. ", "| .--------------. |", "| |    ______    | |", "| |   / ____ `.  | |", "| |   `'  __) |  | |", "| |   _  |__ '.  | |", "| |  | \\____) |  | |", "| |   \\______.'  | |", "| |              | |", "| '--------------' |", " '----------------' "};
			return three;
		case 4:
			String[] four = {" .----------------. ", "| .--------------. |", "| |   _    _     | |", "| |  | |  | |    | |", "| |  | |__| |_   | |", "| |  |____   _|  | |", "| |      _| |_   | |", "| |     |_____|  | |", "| |              | |", "| '--------------' |", " '----------------' "};
			return four;
		case 5:
			String[] five = {" .----------------. ", "| .--------------. |", "| |   _______    | |", "| |  |  _____|   | |", "| |  | |____     | |", "| |  '_.____''.  | |", "| |  | \\____) |  | |", "| |   \\______.'  | |", "| |              | |", "| '--------------' |", " '----------------' "};
			return five;
		case 6:
			String[] six = {" .----------------. ", "| .--------------. |", "| |    ______    | |", "| |  .' ____ \\   | |", "| |  | |____\\_|  | |", "| |  | '____`'.  | |", "| |  | (____) |  | |", "| |  '.______.'  | |", "| |              | |", "| '--------------' |", " '----------------' "};
			return six;
		case 7:
			String[] seven = {" .----------------. ", "| .--------------. |", "| |   _______    | |", "| |  |  ___  |   | |", "| |  |_/  / /    | |", "| |      / /     | |", "| |     / /      | |", "| |    /_/       | |", "| |              | |", "| '--------------' |", " '----------------' "};
			return seven;
		case 8:
			String[] eight = {" .----------------. ", "| .--------------. |", "| |     ____     | |", "| |   .' __ '.   | |", "| |   | (__) |   | |", "| |   .`____'.   | |", "| |  | (____) |  | |", "| |  `.______.'  | |", "| |              | |", "| '--------------' |", " '----------------' "};
			return eight;
		case 9:
			String[] nine = {" .----------------. ", "| .--------------. |", "| |    ______    | |", "| |  .' ____ '.  | |", "| |  | (____) |  | |", "| |  '_.____. |  | |", "| |  | \\____| |  | |", "| |   \\______,'  | |", "| |              | |", "| '--------------' |", " '----------------' "};
			return nine;
		default:
			return null;
		}
	}
	
	public int getDaysInMonth(int month, int year) {
		switch(month) {
		case 1:
			return 31;
		case 2:
			if (year % 4 == 0) {
				return 29;
			}
			
			return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			return 0;
		}
	}
}
