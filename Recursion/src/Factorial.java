import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = factorial(n);
		
		System.out.println(result);
	}
	
	// n! = n*factorial(n-1)!;
	public static int factorial(int n) {
		
		if(n == 0 || n == 1) return 1;
		
		return n*factorial(n-1);
	}

}
