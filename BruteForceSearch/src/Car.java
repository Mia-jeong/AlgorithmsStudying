import java.util.Scanner;

public class Car {

	/* 
	 1)
	 input :
	 1
	 1 2 3 4 5
	 
	 output: 1
	 
	 2)
	 input :
	 3
     1 2 3 5 3
     
     output : 2
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = (sc.nextInt()) % 10;
		int cars[] = new int[5];
		
		int count = 0;
		for (int i = 0; i < cars.length; i++) {
			cars[i] = (sc.nextInt()) % 10;
			if(cars[i] == day) count++;
		}
		
		System.out.println(count);
	}

}
