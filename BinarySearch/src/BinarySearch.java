import java.util.Scanner;

/*
<input>
10 4
1 2 4 8 10 11 12 14 15 19
4 5 8 17

<output>
YES
NO
YES
NO

*/
public class BinarySearch {

	static int nums[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		int questions[] = new int[m];
		for (int i = 0; i < questions.length; i++) {
			questions[i] = sc.nextInt();
		}
		
		for (int i = 0; i < questions.length; i++) {
			boolean flag = binarySearch(questions[i]);
			if(flag) System.out.println("YES");
			else System.out.println("NO");
		}
	}

	public static boolean binarySearch(int n) {
		
		int s  = 0, e = nums.length-1;
		while(s <= e) {
			
			int mid = (s+e)/2;
			int temp = nums[mid];
			if(temp == n) return true;
			
			if(temp > n) e = mid-1;
			else s = mid+1;

		}
		
		return false;
	}
}
