import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {
	public static Map<Integer, Integer> map = new HashMap<>(); 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = fib(n);
		System.out.println(result);
	}
	
	public static int fib(int n) {
		
		if(n < 0 ) return 0;
		else if( n == 1 || n == 2) return 1;
		else if(map.get(n) != null) return map.get(n);
		else {
			map.put(n, (fib(n-1) + fib(n-2)));
			return map.get(n);
		}
	}

}
