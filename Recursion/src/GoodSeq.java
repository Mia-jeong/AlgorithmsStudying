import java.util.Scanner;
/*
<input>
7
<output>
1213121

<input>
10
<output>
1213123132

*/
public class GoodSeq {

	//1 - 2 - 1 
	//      - 3
	//  - 3 - 1
	//      - 2  > 재귀함수호출
	// 새로 넣은 숫자 앞까지는 좋은수열이라고 가정 따라서 새로넣은 숫자부터 앞에꺼랑 비교해줌 
	static int n = 0;
	static boolean printFlag = false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		goodSeq("");
	}
	
	public static void goodSeq(String str) {
		
	
		if(printFlag) return;
		
		else if(str.length() == n) {
			System.out.println(str);
			printFlag = true;
			return;
		}
		
		else {
			for (int i = 1; i <= 3; i++) {
				if(chk(str+i)) {
					goodSeq(str+i);
				}
			}
		}
	}
	
	public static boolean chk(String str) {
		
		boolean flag = true;

		for (int i = 1, j = str.length(); i < str.length(); i++) {
			int temp = j-i;
			String origin = str.substring(temp, j);
			String compare = str.substring(temp-i < 0? 0 : temp-i , temp);
			
			if(origin.length() > compare.length()) {
				break;
			}else {
				if(origin.equals(compare)) {
					flag = false;
					break;
				}
			}
		}
		
		return flag;
	}

}
