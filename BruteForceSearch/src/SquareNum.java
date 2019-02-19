import java.util.Scanner;

/*
 <input>
  0 4 2 5 6
 <output>
  1
 */
public class SquareNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 5;
		int sum = 0;
		for (int i = 0; i < count; i++) {
			int temp = sc.nextInt();
			sum += (temp*temp);
		}
		
		System.out.println(sum%10);
	}

}
