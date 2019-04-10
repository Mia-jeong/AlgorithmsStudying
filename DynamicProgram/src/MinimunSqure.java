import java.util.Scanner;

public class MinimunSqure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int storages[] = new int[n+1];
		if( n> 0) {
			storages[1] = 1;
			
			for (int i = 2; i <= n; i++) {
			   int temp = (int) Math.sqrt(i);
		       for (int sqrt = 1; sqrt<= temp; sqrt++){
		            if (storages[i] == 0 ||storages[i] > storages[i - sqrt*sqrt] + 1) //just in case 
		            	storages[i] = storages[i - sqrt*sqrt] + 1;
		       }
			}

		}
		
		int result = storages[n];
		System.out.println(result);
	}

}
