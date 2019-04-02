import java.util.Scanner;

public class Histogram {

	static int array[];
	static long max = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		array = new int[count];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		binarySearch(0, array.length-1);
		
		System.out.println(max);
	}
	
	public static void binarySearch(int s, int e) {
		
		//s(start point ) 가 e( end point )  보다 크다면 종료(return)
		if( s > e ) return;
		//s(start point ) 가 e( end point ) 보다 작거나 같으면 해당 범위내의 minIdx의 왼쪽 오른쪽 부분을 binarySearch 로 순회해줌(재귀함수) 
		else if (s == e ) {
			if( max <  array[s]) max = array[s];
		}
		else {
			//해당 범위의 최소 값을 가진 index 구하기 
			int minIdx = findMinIdx(s, e);
			
			//넓이: 해당범위 (e-s+1) 높이:최소값 의 직사각형의 너비를 구함  
			long sumValue = sumValue(s, e, array[minIdx]);
			
			//만약 해당 넓이가 max(전역 번수)의 넓이 보다 크다면 max에 해당 넓이를 저장해줌 
			if(sumValue > max) max = sumValue;
			
			//System.out.println("s: " + s + " e : " + e + " minIdx : " + minIdx + " minIdx-value: " + array[minIdx] + " sumValue: " + sumValue + " max: " + max);
			
			//최소 값을 가진 index 의 왼쪽 부분 binarySearch
			if(s <= minIdx-1)binarySearch(s, minIdx -1);
			
			//최소 값을 가진 index 의 오른쪽 부분 binarySearch
			if(minIdx+1 <= e) binarySearch(minIdx+1, e);
		}
		
	}
	
	
	//최소값의 index 를 구하는 함수 
	public static int findMinIdx (int s, int e) {
		int minIdx = s;
		int min =array[s];
		for (int i = s+1; i <= e; i++) {
			if(min > array[i]) {
				min = array[i];
				minIdx = i;
			}
		}
		return minIdx;
	}
	
	//해당 value 에서 s~e까지 범위의 함계를 구함 
	public static long sumValue(int s, int e, int value) {
		return value*((e-s)+1);
	}
}
