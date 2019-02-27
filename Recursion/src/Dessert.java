import java.util.Scanner;



public class Dessert {

	static String operator[];
	static int count;
	static int totalCount = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		count = sc.nextInt();
		operator = new String[count-1];
		dessert(0);
		System.out.println();
	}
	
	public static void dessert(int idx) {
		if(idx >= operator.length) {
		//계산 후 return

			int sum = calculation();
			if(sum == 0) {
				
				totalCount ++;
				//20개 이하일경우에만 출력
				if(totalCount<= 20) {
					printf();
				}
				
				return;
			}
		}
		else {
			String tempOpt[] = {"+", "-", "."};
			for (int i = 0; i < tempOpt.length; i++) {
				operator[idx] = tempOpt[i];
				dessert(idx+1);
			}
		}
	}
	
	public static int calculation() {
		
		//배열로 . 부분 합쳐서 저장하고 원래 인덱스는 0으로 넣어줌 1.2+3-4 > 12 0 3 4
		int number[] = new int[count+1];
		for (int i = 0; i < number.length; i++) {
			number[i] = i+1;
		}
		for (int i = 0; i < operator.length; i++) {
			if(operator[i].equals(".")) {
				//0일경우 그 전에  합쳐준걸 찾아야함..
				for (int j = i; j >=0; j--) {
					if(!(number[j] == 0)) {
						number[j] = makeNumber(number[j], number[i+1]);
						break;
					}
				}
				number[i+1] = 0;
			}
		}
		int sum = number[0];
		for (int i = 0; i < operator.length; i++) {
			if(operator[i].equals("+")) {
				sum += number[i+1];
			}
			if(operator[i].equals("-")) {
				sum -= number[i+1];
			}
			
		}
		return sum;
	}
	
	//집에서 생각해볼것 
	public static int calculationTwo() {
		
		int value = 1;
		int sum = 0;
		
		for (int i = 0; i < operator.length; i++) {
			if(operator[i].equals(".")) {
				value = makeNumber(value, i+2);
			}else {
				if(operator[i].equals("+")) {
					sum+= value;
				}else {
					sum-= value;
				}
				value += i+2;
			}
		}
		
		return sum;
		
	}
	
	public static int makeNumber(int n, int m) {
		
		if(m >= 10) {
			return (n*100) + m;
		}else {
			return (n*10) + m;
		}
	}
	
	
	public static void printf() {
	
		for (int i = 1; i <= operator.length; i++) {
			
			System.out.print(i+" ");
			System.out.print(operator[i-1]+" ");

			
		}
		System.out.println(operator.length+1);
	
	}
	
	

}
