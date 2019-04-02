import java.util.Scanner;

public class MarbleGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean storage[] = new boolean[n+1];
		
		//default
		storage[1] = true;
		storage[2] = true;
		storage[3] = true;
		
		for (int i = 4; i <= n; i++) {
			for (int j = i-3; j < i; j++) {				
				if(!storage[j]) storage[i] = true;
			}

		}
		
		String result = "YES";
		if(!storage[n]) result = "NO";
		
		System.out.println(result);

	}

}
