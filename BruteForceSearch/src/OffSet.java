import java.util.Scanner;

public class OffSet {

	/* 
	 
	 <input>
	 	3 4 1 4 9
		2 9 4 5 8
		9 0 8 2 1
		7 0 2 8 4
		2 7 2 1 4
	 <output>
	 	3 4 * 4 9 
		* 9 4 5 8 
		9 0 8 2 * 
		7 0 2 8 4 
		* 7 2 * 4 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = 5;
		int nums[][] = new int[c][c];
		String save[][] = new String[c][c];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				boolean flag = compare(nums, j, i);
				if(flag) save[i][j] = "*";
				else save[i][j] = nums[i][j]+"";
			}
		}
		
		for (int i = 0; i < save.length; i++) {
			for (int j = 0; j < save[i].length; j++) {
				System.out.print(save[i][j]+" ");
			}
			System.out.println();
		}
	}

	// if num is greater than compared Values, then return false
	// if it's not, return true
	public static boolean compare(int[][] nums, int x, int y) {
		int xR[] = {-1, 1, 0, 0};
		int yR[] = {0, 0, -1, 1};
		int num = nums[y][x];
		
		for (int i = 0; i < xR.length; i++) {
			int xTemp = x+xR[i];
			int yTemp = y+yR[i];
			
			//if it's out of range, then continue;
			if(xTemp < 0 || xTemp >= nums.length || yTemp < 0 || yTemp >= nums.length) 
				continue;
			else {
				if(num >= nums[yTemp][xTemp]) {
					return false;
				}
			}
		}
	
		return true;
		
	}
}
