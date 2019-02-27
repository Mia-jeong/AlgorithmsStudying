import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long result = lcm(a, b);
		System.out.println(result);
	}
	
	public static long lcm (long a, long b) {
		
		
		if(a > b) {
			long temp = a;
			a = b;
			b = temp;
		}
		long gcd = 1;
		long x = a, y = b;
		while(true) {
			long temp = b % a;
			if(temp == 0 ) {
				gcd = a;
				break;
			}
			b = a;
			a = temp;
		}
		return ((x/gcd) * (y/gcd) * gcd);
	}

}
