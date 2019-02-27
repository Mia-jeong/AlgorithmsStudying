import java.util.Scanner;

/*
x^2 + x = 103
x =? 
<input>
103

<output>
9
 
 */
public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		long result = binarySearch(n);
		System.out.println(result);
	}
	
	public static long binarySearch(long n) {
		
		long s = 1, e = (long)Math.sqrt(n);
		long temp = 0;
		while( s <= e ) {
			long mid = (s+e)/2;
			long tempResult = (mid*mid) + mid;
			if(tempResult <= n) {
				temp = mid;
				s = mid+1;
			}
			else {
				e = mid-1;
			}
		}
		
		return temp;
	}

}
