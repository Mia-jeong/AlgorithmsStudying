import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int round = 10;
		int A[] = new int[round];
		int B[] = new int[round];

		for (int i = 0; i < A.length; i++) A[i] = sc.nextInt();
		
		for (int i = 0; i < B.length; i++) B[i] = sc.nextInt();
		
		int aWin = 0, bWin = 0, draw = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] > B[i]) aWin++;
			else if(B[i] > A[i]) bWin++;
			else draw++;
		}
	
		if(aWin == bWin) 
			System.out.println("D");
		else if(aWin > bWin && aWin > draw) 
			System.out.println("A");
		else if(bWin > aWin && bWin > draw)
			System.out.println("B");
		else 
			System.out.println("D");
	}

}
