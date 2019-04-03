import java.util.Scanner;
public class SqurePositon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int divider = 1000007;
		int storages[] = new int[n+1];
		storages[1] = 1;
		storages[2] = 2;
		
		for (int i = 3; i <= n; i++) {
			storages[i] = ((storages[i-1]%divider)+(storages[i-2]%divider))%divider;
		}
		
		int result = storages[n];
		
		System.out.println(result);
		
	}

}
