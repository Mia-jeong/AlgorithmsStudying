import java.util.Scanner;
/*
<input>
3 3
0 8 0
8 8 0
0 0 8

<output>
0 8 0 
0 8 8 
8 0 0
 
 
 */
public class EightNine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int array[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			int s = 0, e = m-1;
			while( s <=  e) {
				int temp = array[i][s];
				array[i][s] = array[i][e];
				array[i][e] = temp;
				s++;
				e--;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
