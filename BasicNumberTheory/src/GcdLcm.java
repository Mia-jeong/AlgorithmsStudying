import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		gcdLcm(a, b);
	}
	
	public static void gcdLcm (int a, int b) {
		
		
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
		
		System.out.println(gcd);
		System.out.println((x/gcd) * (y/gcd) * gcd);
	}


}
