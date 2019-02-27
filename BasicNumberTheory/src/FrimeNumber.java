import java.util.Scanner;

/*
<input>
4
1
3
5
7
<output>
3
*/
public class FrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int nums[] = new int[c];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			boolean flag = checkPrime(nums[i]);
			if(flag) count++;
		}
		
		System.out.println(count);
	}
	
	public static boolean checkPrime(int n) {
		
		if(n == 1) return false;
		
		for (int i = 2; i < n; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}

}
