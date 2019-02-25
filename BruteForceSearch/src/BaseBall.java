import java.util.Scanner;

/*

<input>
4
123 1 1
356 1 0
327 2 0
489 0 1

<output>
2

*/
public class BaseBall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nums[][] = new String[n][3];
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = sc.next();
			}
		}
		
		int count = 0;
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				for (int z = 1; z <= 9; z++) {
					if(i!= j && i != z && j!= z) {
						boolean flag = checkNum(nums, ((i*100)+(j*10)+z) + "");
						if(flag) count++;
					}
				}
			}
		}
		
		System.out.println(count);

	}
	public static boolean checkNum(String[][] nums, String num) {
		
		for (int i = 0; i < nums.length; i++) {
			String numStr = nums[i][0];
			int strike = 0, ball = 0;
			for (int j = 0; j < numStr.length(); j++) {
				for (int z = 0; z < num.length(); z++) {
					if(numStr.charAt(j) == num.charAt(z)) {
						if(j == z) strike++;
						else ball++;
					}
				}
			}
			
			if(strike != Integer.parseInt(nums[i][1]) || ball != Integer.parseInt(nums[i][2])) return false;
			
		}
		
		return true;
	}

}
