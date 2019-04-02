import java.math.BigInteger;
import java.util.Scanner;


public class Power {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long m = sc.nextLong();

		
		long  result = power(n, m);
		System.out.println(result);
	}

	
	public static long power(int n, long m) {
		/*
		 2^8 = 2^4 * 2^4
		 2^7 = 2^3 * 2^3 * 2
		 */
		if(m == 0) {
			return 1;
		}
		else if(m == 1)
			return n;
		else {
			
			long temp = 1;


			if(m % 2 == 0) {
				temp = power(n, m/2);
				return temp * temp;
			}else {
					temp = power(n,  (m-1)/2);
				return temp * temp * n;
			}
			
		}
	}
}
