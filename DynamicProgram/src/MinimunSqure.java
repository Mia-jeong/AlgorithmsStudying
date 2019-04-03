import java.util.Scanner;

public class MinimunSqure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int storages[] = new int[n+1];
		if( n> 0) {
			storages[1] = 1;
			
			for (int i = 2; i < storages.length; i++) {
	
				int temp = (int) Math.floor(Math.sqrt(i));
				storages[i] = 1 + storages[(i- (temp*temp))];
				System.out.println(storages[i]);
			}

		}
		
		int result = storages[n];
		System.out.println(result);
	}

}
