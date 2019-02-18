import java.util.Scanner;

public class NumPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int start = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			//blank
			for (int j = (count-i)-1; j >= 1; j--) {
				System.out.print(" ");
			}
			//nums
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j <= i*2; j++) {
				sb.append(start+"");
				start = (start+1)== 10 ? 1 : start+1; 
			}
			if(i % 2 == 0) {
				System.out.println(sb.reverse().toString());
			}else {
				System.out.println(sb.toString());
			}
		}
	}

}
