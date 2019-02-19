import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(b < a) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		int gcd = 1;
		int lcm = 1;
		while(true) {
			boolean flag = false;
			for (int i = 2; i <= a; i++) {
				if(a % i == 0 && b % i == 0) {
					gcd *= i;
					a /= i;
					b /= i;
					flag = true;
					break;
				}
			}
			
			if( ! flag ) {
				lcm = gcd * a * b;
				break;
			}
		}
		
		System.out.println(gcd);
		System.out.println(lcm);
	}


}
