import java.util.Scanner;


/*
<input>
8
4 5 3

<output>
0 0 0 0 3 0 0 0
0 0 0 3 2 3 0 0
0 0 3 2 1 2 3 0
0 3 2 1 x 1 2 3
0 0 3 2 1 2 3 0
0 0 0 3 2 3 0 0
0 0 0 0 3 0 0 0
0 0 0 0 0 0 0 0

<input>
6
2 3 3

<output>
3 2 1 2 3 0
2 1 x 1 2 3
3 2 1 2 3 0
0 3 2 3 0 0
0 0 3 0 0 0
0 0 0 0 0 0
*/
public class AttackRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int y = sc.nextInt()-1;
		int x = sc.nextInt()-1;
		int r = sc.nextInt();
		
		String arr[][] = new String[count][count];
		
		/* 
		 * Solve the problem using absolute value   >int sum = Math.abs(i-y) + Math.abs(j-x);
		 * 1) loop all of the range
		 * 2) i = row index / y = column index;
		 * 3) the position of x :  y = row index / x = column index 
		 * 4) put the value of (sum =  |y-i| + |x-j|) on the each position
		 * 5) if  sum is greater than r (attack range) then put "0" on the each position
		 * 6) if sum is less than r then put sum on the each position
		 */
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int sum = Math.abs(i-y) + Math.abs(j-x);
				if(sum <= r && sum != 0) arr[i][j] = sum+"";
				else arr[i][j] = "0";
			}
		}
		
		arr[y][x] = "x";
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
