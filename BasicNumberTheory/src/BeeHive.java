import java.util.Scanner;

/*

<input>
13
<output>
3

<input>
58
<output>
5
*/
public class BeeHive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int idx = 1;
		if(n == 1) System.out.println(idx);
		else {
			int s = 2, e = 2;
			while(true) {
				
				int count = (idx * 6)-1;
				e = s+ count;
				if(n >= s && n <= e) {
					break;
				}else {
					s = e+1;
					idx ++;
				}
				
			}
			
			System.out.println(idx+1);
		}
	}

}
