import java.util.Scanner;

/*
<input>
AAABBBBBCCCCDDDDEFFF

<output>
3A5B4C4DE3F
*/
public class Compression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine()+"0";
		sc.close();
		
		String result ="";
		int count = 1;
		
		for (int i = 0; i < input.length()-1; i++) {
			
			String cur = input.charAt(i)+"";
			String next = input.charAt(i+1)+"";

			//같으면 count 증가시켜줌
			if(cur.equals(next)) {
				count++;
			//다르면 result에 그전까지 같은 count 갯수 넣어주고  count 는 0으로 초기화 
			}else {
				if(count > 1) {
					result+=count+cur;
					count = 1;
				}else {
					result += cur;
				}
			}

		}
		
		System.out.println(result);
	}

}
