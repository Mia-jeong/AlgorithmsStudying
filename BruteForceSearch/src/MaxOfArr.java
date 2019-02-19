import java.util.Scanner;
/*
<input>
3 23 85 34 17 74 25 52 65
10 7 39 42 88 52 14 72 63
87 42 18 78 53 45 18 84 53
34 28 64 85 12 16 75 36 55
21 77 45 35 28 75 90 76 1
25 87 65 15 28 11 37 28 74
65 27 75 41 7 89 78 64 39
47 47 70 45 23 65 3 41 44
87 13 82 38 31 12 29 29 80

<output>
90
5 7
 */
public class MaxOfArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 9;
		int arr[][] = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int x = 0, y = 0;
		int max = arr[0][0];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(max < arr[i][j]) {
					max =  arr[i][j];
					y = i;
					x = j;
				}
				
				if(max == arr[i][j]) {
					if(y > i) {
						y = i;
						x = j;
					}
				}
			}
		}
		
		System.out.println(max);
		System.out.println((y+1) +" " + (x+1));
		
		

	}

}
