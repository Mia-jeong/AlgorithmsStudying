import java.util.Scanner;

public class AlphabetSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String inputs[] = new String[n];
		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = sc.next();
		}
		sc.close();
		
		bubbleSort(inputs);
		for (int i = 0; i < inputs.length; i++) {
			System.out.println(inputs[i]);
		}
	}

    static void bubbleSort(String[] inputs) {  
        int n = inputs.length;  
        String temp = "" ; 
        for(int i=0; i < n; i++){  
	        for(int j=1; j < (n-i); j++){  
			    if(inputs[j-1].compareTo(inputs[j]) > 0){  
				    //swap elements  
				    temp = inputs[j-1];  
				    inputs[j-1] = inputs[j];  
				    inputs[j] = temp;  
			    }  
	        }  
        }  
  
    }  
}
