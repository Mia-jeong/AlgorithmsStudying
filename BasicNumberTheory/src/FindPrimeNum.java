import java.util.Scanner;

public class FindPrimeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean flag = findPrimeNum(n);
		if(flag ) System.out.println(n + " is Prime Number");
		else System.out.println(n + " is not Prime Number");
	}
	
	public static boolean findPrimeNum(int n) {
		
		for (int i = 2; i < n; i++) {
			if(n % i == 0) return false;
		}
		
		return true;
	}

}
