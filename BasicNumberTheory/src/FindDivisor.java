import java.util.Scanner;

public class FindDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		findDivisor(n);
	}
	
	public static void findDivisor(int n) {
		
		for (int i = 1; i <= n; i++) {
			if(n % i == 0 ) System.out.print(i+" ");
		}
		System.out.println();
	}

}
