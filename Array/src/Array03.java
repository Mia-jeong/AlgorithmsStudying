import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		int array[][] = new int[c][c];
		int increment = 1;
		for (int i = 0; i < array.length; i++) {
			int s = i-1<0? 0: i-1;
			s = array[s][0] + increment;
			int temp = increment;
			for (int j = 0; j < (array[i].length-i); j++) {
				array[i][j] = s;
				System.out.print(array[i][j]+ " ");
				s = s+temp;
				temp++;
			}
			increment ++;
			System.out.println();
		}
	}

}
