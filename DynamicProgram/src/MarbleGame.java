import java.util.Scanner;


/*
Jack and tom play a marble game, the rules are below
1) they take marbles away in turn, the starter is Jack
2) when they take marbles away, the can have it on range from 1 to 3 at one time.
3) when it's your turn, if there're nothing to take away, you lose

you can play it with given n of marbles
if Jack can win, print out YES
if not, NO

when they play a game, they'll do their best
<input>
3
<output>
YES

<input>
191124
<output>
NO
*/
public class MarbleGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean storage[] = new boolean[n+1];
		
		//default
		storage[1] = true;
		storage[2] = true;
		storage[3] = true;
		
		for (int i = 4; i <= n; i++) {
			for (int j = i-3; j < i; j++) {				
				if(!storage[j]) storage[i] = true;
			}

		}
		
		String result = "YES";
		if(!storage[n]) result = "NO";
		
		System.out.println(result);

	}

}
