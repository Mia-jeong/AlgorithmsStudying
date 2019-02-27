import java.util.Scanner;

/*
<input>
4
1
3
7
13
 
<output>
3
 */
public class StreetTree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int arr[] = new int[c];
		
		int diff[] = new int[c-1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			diff[i] = arr[i+1]- arr[i];
		}
		
		int tGcd = diff[0];
		
		for (int i = 1; i < diff.length; i++) {
			tGcd = gcd(tGcd, diff[i]);
		}
		
		int result = count(diff, tGcd);
		System.out.println(result);
		
		
	}
	
	public static int gcd (int a, int b) {
		
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		int gcd = 1;
		int x = a, y = b;
		while(true) {
			int temp = b % a;
			if(temp == 0 ) {
				gcd = a;
				break;
			}
			b = a;
			a = temp;
		}
		
		return gcd;
	}
	
	public static int count (int diff[], int gcd) {
		
		int result = 0;
		for (int i = 0; i < diff.length; i++) {
			result += (diff[i]/gcd)-1;
		}
		
		return result;
		
	}

}
