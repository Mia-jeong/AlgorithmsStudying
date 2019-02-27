import java.util.Arrays;
import java.util.Scanner;


/*
<input>
5
6 3 2 10 -10
8
10 9 -5 2 3 4 5 -10

<output>
1
0
0
1
1
0
0
1


*/
public class NumberBox {
	static long nums[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		nums = new long[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextLong();
		}
		Arrays.sort(nums);
		int m = sc.nextInt();
		long questions[] = new long[m];
		for (int i = 0; i < questions.length; i++) {
			questions[i] = sc.nextLong();
		}
		
		for (int i = 0; i < questions.length; i++) {
			boolean flag = binarySearch(questions[i]);
			if(flag) System.out.println("1");
			else System.out.println("0");
		}
	}
	
	public static boolean binarySearch(long n) {
		
		int s  = 0, e = nums.length-1;
		while(s <= e) {
			
			int mid = (s+e)/2;
			long temp = nums[mid];
			if(temp == n) return true;
			
			if(temp > n) e = mid-1;
			else s = mid+1;

		}
		
		return false;
	}

}
