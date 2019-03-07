import java.util.Arrays;
import java.util.Scanner;

/*
<input>
6
1 1 1 2 2 3
<output>
NO

<input>
6
1 2 3 4 5 6
<output>
YES

<input>
8
1 2 2 2 1 1 1 3
<output>
NO
 */
public class BoxPaint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int arr[] = new int[c];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		//컬러색깔 갯수를 세어줄 배열 (1번색깔은 flag[1] 갯수에 들어감
		int flags[] = new int[c+1];
		//총 칠해진 면의 갯수를 담아줄 변수 
		int colours = 0;
		
		//정육면체의 인접한 면이 아닐때만 색칠하게 하려면 최소 3개 종류와 해당 색이 2개 있어야함 (즉 최소 2개의 면까지 똑같은 색으로 칠할 수있음)
		for (int i = 0; i < arr.length; i++) {
			
			//해당 색이 2개 이상이면 무시 
			if(flags[arr[i]]== 2) continue;
			//아니면 면을 색칠 
			flags[arr[i]]++;
		}
		
		//색칠된 컬러색의 수를 구함 
		for (int i = 1; i <flags.length; i++) {
			if(flags[i]> 0) colours += flags[i];
		}
		//만약 6면 모두 색칠 되었으면 YES 아니면 NO
		if(colours>= 6) System.out.println("YES");
		else System.out.println("NO");
	}

}
