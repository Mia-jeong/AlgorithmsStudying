import java.util.Scanner;

//백준 2579
//https://www.acmicpc.net/problem/2579
public class StairStep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int step[] = new int[n];
		int storages[] = new int[n+1];
		for (int i = 0; i < step.length; i++) {
			step[i] = sc.nextInt();
		}
		
		storages[1] = step[0];
		storages[2] = Math.max(step[0]+step[1], step[1]);
		storages[3] = Math.max(step[0]+step[2], step[1]+step[2]);
		for (int i = 4; i < storages.length; i++) {
			int tempA = step[i-1]+step[i-2]+storages[i-3];	//연속으로 밟을 경우
			int tempB = step[i-1]+storages[i-2];	//연속으로 밟지 않을 경우
			
			int result = Math.max(tempA, tempB);
			storages[i] = result;
			//System.out.println(storages[i]+" i: " + i);
		}
		
		System.out.println(storages[n]);
	}

}
