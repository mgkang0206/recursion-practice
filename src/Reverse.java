/**
 * Created by mgkan on 2016-07-21.
 */
public class Reverse {
	public static void main(String[] args) {
		System.out.println(reverse("MichaelKang"));
		System.out.println(reverse(reverse("MichaelKang")));
	}
	public static String reverse(String s){
		if(s.length() == 0){
			return "";
		}else if(s.length() == 1){
			return s;
		}else{
			char c = s.charAt(s.length()-1);
			char d = s.charAt(0);
			String su = s.substring(1,s.length()-1);
			return c + reverse(su)+ d;
		}
	}
}
