import java.util.Scanner;
/*
<input>
5
2 3 1 7 3
4 1 9 6 8
5 5 2 4 4
6 5 2 6 7
8 4 2 2 2
<output>
4
 
 */
public class ClassPresident {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = 5;
		int count = sc.nextInt();
		
		int arr[][] = new int[count][grade];
		
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int max = 0; int student = 0;
		for (int i = 0; i < count; i++) {
			int studentCount = 0;
			int duplicate[] = new int[count];
			for (int j = 0; j < grade; j++) {
				for (int z = 0; z < count; z++) {
					
					if(duplicate[z] == 1) continue;
					
					if(arr[i][j] == arr[z][j] && (i != z)) {
						studentCount++;
						duplicate[z] = 1;
					}
				}
			}
			
			if(studentCount > max ) {
				max = studentCount;
				student = i;
			}
		}
		
		System.out.println(student+1);
	}

}
