import java.util.Arrays;
import java.util.Scanner;
/*
<input>
10
40
30
60
30
20
60
30
40
50
<output>
37
30
 */
public class RepresentativeValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int result[] = new int[101];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0, value = 0;
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			sum += arr[i];
			result[temp/10]++;
		}
		
		for (int i = 0; i < result.length; i++) {
			if(result[i] > max ) {
				max = result[i];
				value = i*10;
			}
		}
		System.out.println(sum/10); //average
		System.out.println(value); //mode
	}

}
