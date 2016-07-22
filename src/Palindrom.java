public class Palindrom {
	public static void main(String[] args) {
		System.out.println(palindrom("racechjghjhgar"));
	}

	public static boolean palindrom(String s) {
		if (s == null) {
			return false;
		} else if (s.length() <= 1) {
			return true;
		} else if (s.charAt(0) != s.charAt(s.length()-1)) {
			return false;
		}

		String middle = s.substring(1, s.length() - 1);
		return palindrom(middle);
	}
}