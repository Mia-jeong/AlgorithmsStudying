import java.util.Scanner;

//백준 1423
//https://www.acmicpc.net/problem/1463
public class MakeOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int storages[] = new int[n+1];
		
		for (int i = 2; i < storages.length; i++) {
			int result = storages[i-1];
			if(i % 2 == 0) result = Math.min(result, storages[i/2]);
			if(i % 3 == 0) result = Math.min(result, storages[i/3]);

			storages[i] = result+1;
		}
		
		System.out.println(storages[n]);
	}

}
