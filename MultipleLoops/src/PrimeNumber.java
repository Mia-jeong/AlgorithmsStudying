import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		for (int i = s<2?2:s; i <=e; i++) {

			boolean flag = false;
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					flag = true;
					break;
				}
			}
			if(!flag) System.out.print(i+" ");

		}

	}

}
