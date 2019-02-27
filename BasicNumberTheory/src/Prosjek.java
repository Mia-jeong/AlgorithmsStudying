import java.util.Scanner;


/*
<input>
1
2
<output>
2

<input>
4
3 2 3 5
<output>
3 1 5 11

<input>
5
1 2 2 3 4
<output>
1 3 2 6 8
*/
public class Prosjek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int nums[] = new int[count];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		System.out.print(nums[0] + " ");
		for (int i = 1; i <= count-1; i++) {
			int result = (nums[i] * (i+1)) - (nums[i-1] * i);
			System.out.print(result + " ");
		}
	}

}
