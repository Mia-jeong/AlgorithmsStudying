import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numbers[] = new int[n];
		 int storages[] = new int[n];
		int max = -1;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		storages[0] = numbers[0];
		max = storages[0];
		
		if(n > 1) {
			storages[1] = numbers[1] + numbers[0];
			max = storages[1];
			for (int i = 2; i < storages.length; i++) {
				
				//1. 안 뽑았을 경우 (i-1)의 최대값이 최대값
				
				int a = storages[i-1];
				
				//2. 연속으로 뽑았을 경우  i-1, i / (i-3) + i-1 + i;
				
				int b = (i-3 < 0 ? 0 : storages[i-3]) + numbers[i-1]+numbers[i];
				
				//3. 뽑긴 뽑았으나 연속으로 뽑지 않았을경우 / (i-2) + i;
				int c = storages[i-2] + numbers[i];
				
				//System.out.println("a: " + a + " b: " + b + " c: " + c);
				int large = (a>b)&&(a>c)?a:(c>b?c:b);
				storages[i] = large;
				if(large>max) {
					max = large;
				}
			}
		}

		System.out.println(max);
	}
	


	
}
