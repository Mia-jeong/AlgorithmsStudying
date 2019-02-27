import java.util.Scanner;
/*
<input>
4
0 3 6 7
3 0 5 6
6 5 0 9
7 6 9 0

<output>
2 1 4 5
*/
public class SequenceSum {
	// 1. 첫번째 숫자를 1로 추정 
	// 2. array를 하나 설정해 1로 추정하고 나머지 값들을 다 넣어줌
	// 3. 이중 반복문을 통해 해당 값들의 합이 입력받은 이중배열 합들과 일치하는지 확인
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int range = arr[0][1];
		int guess[] = new int[n];
		
		for (int i = 1; i <= range; i++) {
			guess[0] = i;
			for (int j = 1; j < arr.length; j++) {
				guess[j] = arr[0][j] - guess[0];
			}
			
			boolean flag = check(guess, arr);
			if(flag) break;
		}
		
		for (int i = 0; i < guess.length; i++) {
			System.out.print(guess[i]+ " ");
		}
	}
	
	//추측한숫자들이 정확한지 이중 배열을 돌면서 확인해주는 함수 
	public static boolean check(int guess[], int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[i].length; j++) {
				int temp = guess[i] + guess[j];
				if(i != j && temp != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}
