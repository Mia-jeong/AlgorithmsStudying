import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/*

<input>
10 3

<output>
4
*/
public class Plague {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int vilages = sc.nextInt();
		boolean flags[] = new boolean[vilages+1];
		int start = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(start);
		flags[start] = true;
		int count = 0;
		while(!q.isEmpty()) {
			int top = q.poll();
			count++;
			int a = top / 3;
			int b = top * 2;
			if( a >= 1  && flags[a] == false) {
				q.add(a);
				flags[a] = true;
			}
			if( b <= vilages && flags[b] == false) {
				q.add(b);
				flags[b] = true;
			}
		}
		
		int result = vilages - count;
		System.out.println(result);
	}

}
