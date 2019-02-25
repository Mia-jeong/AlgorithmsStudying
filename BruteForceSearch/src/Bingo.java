import java.util.Scanner;


//backjoon 2578

/*

<input>
11 12 2 24 10
16 1 13 3 25
6 20 5 21 17
19 4 8 14 9
22 15 7 23 18
5 10 7 16 2
4 22 8 17 13
3 18 1 6 25
12 19 23 14 21
11 24 9 20 15

<output>
15
*/
public class Bingo {
	
	static int[][] bingoPanel;
	static int[][] markPanel;

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = 5;
 
        boolean check = true;
        //빙고판
        bingoPanel = new int[n][n];
        //사회자 번호
        markPanel = new int[n][n];
        
        //빙고입력
        for (int i = 0; i < bingoPanel.length; i++) {
            for (int j = 0; j < bingoPanel[i].length; j++) {
                bingoPanel[i][j] = sc.nextInt();
            } 
        }
        
        //mark패널 입력
        //mark패널확인
        for (int i = 0; i < markPanel.length; i++) {
            for (int j = 0; j < markPanel[i].length; j++) {
                markPanel[i][j] = sc.nextInt();
                
            } 
            
        }

        boolean flag = false;
        for (int i = 0; i < markPanel.length; i++) {
            
            for (int j = 0; j < markPanel[i].length; j++) {
            	
            	flag = checkBingo(markPanel[i][j]);
            	if(flag) {
            		System.out.println((i * 5) + (j+1));
            		break;
            	}
            	
            } 
            
            if(flag) break;
        }
        
		
	}
	
	public static boolean checkBingo(int n) {

		//marking
		for (int i = 0; i < bingoPanel.length; i++) {
			for (int j = 0; j < bingoPanel.length; j++) {
				if(n == bingoPanel[i][j])
					bingoPanel[i][j] = 0;
			}
		}
		
		//전체계산해서 빙고 count 세어줌
        int bingoCount = 0;
        //왼쪽대각선 오른쪽 대각선 (대각선은 한 번 만)
        int leftCross = 0;
        int rightCross = 0;
        //가로 세로
        for (int i = 0; i < bingoPanel.length; i++) {
            int rowSum = 0;
            int colSum = 0;

            //가로 세로 왼쪽 대각선 //오른쪽대각선
            for (int j = 0; j < markPanel.length; j++) {
                rowSum += bingoPanel[i][j]; //가로
                colSum += bingoPanel[j][i]; //세로

            }
            
            leftCross += bingoPanel[i][i]; //왼쪽대각선
            rightCross += bingoPanel[i][4-i]; //오른쪽대각선
            
            if(rowSum == 0) bingoCount ++;                            
            if(colSum == 0) bingoCount ++;
            
        }
        
        if(leftCross == 0) bingoCount ++;
        if(rightCross == 0) bingoCount ++;
        
        if(bingoCount >= 3) {
            return true;
        }
        
        return false;
	}

}
