

class MyHeap {
	int max = 100;
	int data[] = new int[max];
	int len = 1;

	public void push(int n) {
		data[len++] = n;
		
		int idx = len-1;
		while(idx > 1) {
			//해당 노드가 부모노드 보다 우선순위가 높다면 교체
			if(data[idx] < data[idx/2]) {
				int temp = data[idx];
				data[idx] = data[idx/2];
				data[idx/2] = temp;
			}
			else break;
			
			idx = idx/2;
		}
	}
	
	public void pop() {
		
		data[1] = data[--len];
		data[len] = 0;
		
		int inx = 1;
		
		while(true) {

			//1. 자식들 중에서 우선순위가 높은 친구를 알아내자
			//2. 나와 그 우선순위가 높은 친구를 비교해서 자리를 바꾸자
			
			int pIdx = -1; //우선순위가 높은 친구의 노드의 번호
			
			
			//(A) 자식이 모두 없는 경우
			//(B) 왼쪽 자식만 있는 경우
			//(C) 왼쪽 자식 오른쪽 자식 모두 존재하는 경우 
			if(len<= inx*2) break; //A
			
			if(1<= inx*2 && inx*2 <len && len <= inx*2+1) {
				pIdx = inx*2;
			}
			if(data[inx*2] < data[inx*2+1]) {
				pIdx = inx*2;
			}else {
				pIdx = inx*2+1;
			}
			
			if(data[inx] > data[pIdx]) {
				int temp = data[inx];
				data[inx]= data[pIdx];
				data[pIdx] = temp;
				inx = pIdx;
			}else break;
		}
	}
	
	public int top() {

		return data[1];
	}
	
}
public class Heap {
//부모의 값이 항상 자식보다 작은 완전 이진 트리 == 부모일수록 우선순위가 높다 
/*
 	  3
 	6    7
   7  8 9  11 

push
  3
6    7
7  8 9  11     
1

  3
6    7
1  8 9  11     
7
  3
1    7
6  8 9  11     
7
  1
3    7
6  8 9  11     
7
pop
  11
6    7
7  8 9  

  6
11  7
7  8 9

  6
7   7
11 8 9
*/
	public static void main(String[] args) {

	}

}
