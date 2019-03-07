import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static long[] solutions;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solutions = new long[n];
		int check = 0;
		for (int i = 0; i < solutions.length; i++) {
			solutions[i] = sc.nextLong();
		}
		Arrays.sort(solutions);
		
		//양수 음수 체크
		boolean minusflag = true;
		boolean plusflag = true;
		for (int i = 0; i < solutions.length; i++) {
			if(solutions[i] > 0) {
				minusflag =false;
				break;
			}
		}
		
		for (int i = 0; i < solutions.length; i++) {
			if(solutions[i] < 0) {
				plusflag =false;
				break;
			}
		}
		
		
		
		
		long max = 1999999999;
		long a = 0, b = 0;
		//flag true 면 모두 양수 나 음수
		//수가 모두 음수일경우 제일 큰수와 두번째로 큰수끼리 더해야 값이 제일 작음
		if(minusflag) {
			a = solutions[n-2];
			b = solutions[n-1];
		} 
		//수가 모드 양수일경우 제일 작은 수와 두번째로 작은수를 더해야 값이 제일 작음
		else if(plusflag) {
			a = solutions[0];
			b = solutions[1];
		}
		//그게 아닐경우 binary search
		else {
			for (int i = 0; i < solutions.length; i++) {
				int idx = solution(solutions[i], i);
				long temp = Math.abs(solutions[i]+solutions[idx]);
				//System.out.println("temp: " + temp + " i: " +  i + "v: " + solutions[i] +  " idx: " + idx + " v:" + solutions[idx]  + " max: " + max);
				if(temp < max) {
					a = solutions[i];
					b = solutions[idx];
					max = temp;
				}
			}
		}
		
		System.out.println(a + " " + b);
	}

	//binary search 해서 구한 index 의 -1과 +1값도 계산해줌
    public static int compare(int sIdx, int cIdx) {
        
    	int arr[] = {1, -1};

    	long result = Math.abs(solutions[sIdx]+solutions[cIdx]);
    	int resultIdx = cIdx;
    	for (int i = 0; i < arr.length; i++) {
			int temp = cIdx+arr[i];
			if(temp >= 0 && temp < solutions.length-1 && temp != sIdx) {
				long tempResult = Math.abs(solutions[sIdx]+solutions[temp]);
				if(tempResult < result) {
					resultIdx = temp;
				}
			}
		}
        
        return resultIdx;
    }
    
    
    /*
       	배열을 sorting 한후 값 하나하나씩 해당 값과 가장 가까운 값의 index를 구해줌 
       	 ex) -99 면 기준값은 (-99*-1)
       	 기준값보다 해당 값이 크다면 왼쪽
       	 기준값보다 해당 값이 작다면 오른쪽
       	 참고로 idx 2 의 값은 idx 1값을 돌면서 2랑 이미 비교해줬으므로 비교는 해당 idx+1 부터 해주면 됨 
       	 즉, solutions[i] 값을 비교할때 기준은 s == i+1 / e == solutions.lenght-1
      
     */
	public static int solution(long n, int idx) {
		
		int s = idx+1, e = solutions.length-1;
		long temp = n*(-1); //기준값
		int resultidx = 0;
		while(s <= e) {
			int mid = (s+e)/2;
			resultidx =  mid;
			if(temp > solutions[mid]) {
				s = mid+1;
			}else if( temp < solutions[mid]) {
				e = mid-1;
			}else {
				break;
			}
		}
		
		
		return compare(idx, resultidx);
		
	}
}
