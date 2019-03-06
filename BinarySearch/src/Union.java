import java.util.Scanner;
/*
 <input>
2
1 4
3 5
3
------------------
[1, 2, 3, 3, 4, 5]
<output>
3

<input>
3
1 3
2 10
1 8
5
---------------------------------------------------------------
[1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5 , 5, 6, 6, 7, 7, 8, 8, 9, 10]
<output>
3
 */ 
public class Union {

	static long array[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		array = new long[index][2];
		long min = 0; //최소 시작 숫자
		long end = 0; //최대 끝 숫자 
		for (int i = 0; i < array.length; i++) {
			long s = sc.nextLong();
			long e= sc.nextLong();
			if(i == 0) {
				min = s;
				end = e;
			}else {
				if(min > s) min= s;
				if(end < e) end = e;
			}
			array[i][0] = s;
			array[i][1] = e;
		}
		
		long findIdx = sc.nextLong();
		
		long result = binarySearch(min, end, findIdx+1);
		System.out.println(result);
	}
	
	public static long binarySearch(long s, long e, long findIdx) {
		
		long mid = (s+e)/2;
		
		if( s <= e) {
			long sumCount= 0; //각 이차배열에 해당 숫자  그보다 작은 숫자가 몇개인지 찾는다.
			long smallerCount = 0;  //mid 보다 작은숫자 갯수
			long sameCount = 0; //mid 와 같은 숫자갯수 
			for (int i = 0; i < array.length; i++) {
				long sT = array[i][0];
				long eT = array[i][1];
				if(eT < mid) smallerCount += (eT-sT)+1;
				else if (sT <= mid){
					smallerCount += mid-sT;
					sameCount += 1;
				}
			}
			
			sumCount += smallerCount + sameCount;
			
			if(smallerCount < findIdx && sumCount >= findIdx || sumCount == findIdx || smallerCount == findIdx-1 ) {
				return mid;
			}
			else {
				if(sumCount > findIdx) {
					return binarySearch(s, mid-1, findIdx);
				}
				
				else if(sumCount < findIdx) {
					return binarySearch(mid+1, e, findIdx);
				}
				
			}
			
			
		}
		
		return mid;
	}
	

}
