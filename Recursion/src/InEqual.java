import java.util.Scanner;

public class InEqual {

	static String arr[];
	static int nums[];
	static boolean flags[] = new boolean[10];
	static boolean check = false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		arr = new String[c];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		nums = new int[c+1];
		
		//최대
		for (int i = 9; i >= 0; i--) {
			flags[i] = true;
			nums[0] = i;
			inEqualMax(1);
			flags[i] = false;
		}
		
		nums = new int[nums.length];
		flags = new boolean[flags.length];
		check = false;
		
		//최소
		for (int i = 0; i <= 9; i++) {
			flags[i] = true;
			nums[0] = i;
			inEqualMin(1);
			flags[i] = false;
		}
	}
	
	public static void inEqualMax(int idx) {
		if(check == true) return;
		if(idx == arr.length+1) {
			print();
			check = true;
			//초기화
		}else {
			for (int i = 9; i >= 0 ; i--) {
				if(!flags[i]) {
					if(arr[idx-1].equals("<")) {
						if(nums[idx-1] < i) {
							flags[i] = true;
							nums[idx] = i;
							inEqualMax(idx+1);
							flags[i] = false;
						}
					}else {
						if(nums[idx-1] > i) {
							flags[i] = true;
							nums[idx] = i;
							inEqualMax(idx+1);
							flags[i] = false;
						}
					}
				}
			}
		}
	}
	
	public static void inEqualMin(int idx) {
		if(check == true) return;
		if(idx == arr.length+1) {
			print();
			check = true;
			//초기화
		}else {
			for (int i = 0; i <= 9 ; i++) {
				if(!flags[i]) {
					if(arr[idx-1].equals("<")) {
						if(nums[idx-1] < i) {
							flags[i] = true;
							nums[idx] = i;
							inEqualMin(idx+1);
							flags[i] = false;
						}
					}else {
						if(nums[idx-1] > i) {
							flags[i] = true;
							nums[idx] = i;
							inEqualMin(idx+1);
							flags[i] = false;
						}
					}
				}
			}
		}
	}
	
	public static void print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nums.length; i++) {
			sb.append(nums[i]);
		}
		
		System.out.println(sb.toString());
	}

}
