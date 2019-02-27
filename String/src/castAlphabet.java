import java.util.Scanner;

public class castAlphabet {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String result ="";
        sc.close();
 
        //ASCII CODE
        //A-Z = 65 ~ 90
        //a-z = 97 ~ 122 
        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            int ascii = (int)a;
            int temp = 0;
            char convert = a;
            if(ascii >= 97 && ascii <= 122 ) {
                temp = ascii - 32;
                convert = (char)temp;
            }else if(ascii >= 65 && ascii <= 90) {
                temp = ascii + 32;
                convert = (char)temp;
            }
            
            result += convert+"";
        }
        
        System.out.println(result);

	}

}
