import java.util.Scanner;

public class NoDuplication {

	static int n;
	static int arr[];
	static int flag[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		flag= new int[n+1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = binarySearch();
		
		System.out.println(result);
	}
	
	public static int binarySearch() {
		
		int result = 1;
		
		int s = 2, e = n;
		
		while ( s <= e ) {
			
			int mid = (s+e)/2;
			boolean flag = check(mid);
			
			if(flag) {
				result =mid;
				s = mid+1;
			}else {
				e = mid-1;
			}
			
		}
		return result;
	}
	public static boolean check(int interval) {
		flag= new int[n+1];
		//초기화 를 통한 time limit을 피하기 위해서 
		//첫번째 검사일때는 flag 해당 index 에 해당번호 마다  번호가 있다면 1번 넣어주기
		//두번째 검사일때는 flag 해당 index 마다 번호가 있다면 2번 넣어주기 
		//세번째 검사일때는 flag 해당 index 마다 번호가 있다면 3번 넣어주기 
		for (int i = 0; i <= n-interval; i++) {
			boolean check = false;
			for (int j = i; j < i+interval; j++) {
				int temp  = arr[j];
				if(flag[temp] != (i+1)) {
					flag[temp] = (i+1);
				}else {
					check = true;
					break;
				}
			}
			if(!check) return true;
			
		}
		return false;
	}
	
	

}
