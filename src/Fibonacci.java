/**
 * Created by mgkan on 2016-07-21.
 */
public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fib(5));
	}
	public static int fib(int i){
		if(i == 0){
			return 0;
		}else if(i <= 2){
			return 1;
		}else{
			return fib(i - 1) + fib(i - 2);
		}
	}
}
