package Arrays;

public class StringShifts {

	public String stringShift(String s, int[][] shift) {

		if (s.length() == 0)
			return "";

		for (int i = 0; i < shift.length; i++) {
			int direction = shift[i][0];
			int amount = shift[i][1];
			int len = s.length();
			if (direction == 0) {
				while (amount-- != 0) {
					s = s + s.charAt(0);
					s = s.substring(1, len+1);
				}
			} else if (direction == 1) {
				while (amount-- != 0) {
					s = s.charAt(len - 1) + s;
					s = s.substring(0, len);
				}
			}
		}

		return s;
	}

	public static void main(String[] args) {
		StringShifts s = new StringShifts();
		int [][] shift = new int[2][2];
		shift[0][0] =0;
		shift[0][1] =1;
		shift[1][0] =1;
		shift[1][1] =2;
		System.out.println(s.stringShift("abc", shift));
	}

}
