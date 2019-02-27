import java.util.Scanner;

/*
<input>
2 7
3 5

<output>
31 35
*/
public class FractionSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //분자1
		int b = sc.nextInt(); //분모1
		int c = sc.nextInt(); //분자2
		int d = sc.nextInt(); //분모2
		
		int gcd = gcd(b, d);
		int bunmo = lcm(gcd, b, d);
		int bunza = ((bunmo/b) * a ) + ((bunmo/d) * c);
		
		gcd = gcd(bunmo, bunza);
		bunmo = bunmo / gcd;
		bunza = bunza / gcd;
		
		System.out.println(bunza +" "+ bunmo);
	}
	
	public static int gcd(int a, int b) {
		
		if( b > a ) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		if(a % b == 0 ) {
			return b;
		}else {
			return gcd(b, a%b);
		}
		
		
	}
	
	public static int lcm(int gcd, int a, int b) {
		
		return gcd * (a/gcd) * (b/gcd);
		
	}
}
