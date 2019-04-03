import java.util.Scanner;

public class SequenceMaxSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long storages[] = new long[n];
		
		for (int i = 0; i < storages.length; i++) {
			storages[i] = sc.nextLong();
		}
		
		long max = storages[0];
		for (int i = 1; i < storages.length; i++) {
			
			long a = storages[i];
			long b = storages[i]+ storages[i-1];
			
			storages[i] = a > b? a : b;
			
			if(max < storages[i]) max = storages[i];
		}
		
		System.out.println(max);
		
	}

}
