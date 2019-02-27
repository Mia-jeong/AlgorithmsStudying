import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		primeFactorization(n);
	}
	
	public static void primeFactorization(int n) {
		int temp = n;
		for (int i = 2; temp > 1;) {
			if(temp % i == 0 ) {
				System.out.print(i+" ");
				temp /= i;
			}
			else i++;
		}
	}

}
