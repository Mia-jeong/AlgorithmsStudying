import java.util.Scanner;

public class Fmttalpha {
//Fly me to the Alpha Centauri 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		fmttalpha(start, end);

	}
	public static void fmttalpha(int start, int end) {
		
		int distance = end - start;
		//2를 빼주는 이유는 돌아오기직전은 반드시 1광년 이동 / 처음 이동시 1광년 이동 따라서 -2를 해주는 것임 
		int distanceInMiddle = distance -2;
		int count = 0;
		for (int i = 1; distanceInMiddle != 0; ) {
			
			int sum = sum(i+1);

			if(sum <= distanceInMiddle) {
				distanceInMiddle -= i+1;
				i += 1;
				count++;
			}else {
				
				sum = sum(i);
				if(sum <= distanceInMiddle) {
					distanceInMiddle -= i;
					count++;
				}else {
					i--;
				}
				
			}

		}
		
		System.out.println(count+2);
	}
	public static int sum(int max) {

		int result = max;
		for (int i = max-1; i >= 2; i--) {
			result += i;
		}
		
		return result;
	}

}
