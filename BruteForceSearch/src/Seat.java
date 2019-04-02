import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int c = sc.nextInt(); //column 가로
	    int r = sc.nextInt(); //row  세로
	    int o = sc.nextInt(); //order  순서
	    int minus=0;
	    int x=1,y=0;
	    if(c*r<o){
	       System.out.println(0);
	    }else {
		    while(true){
		        if(o>r-minus){
		            y+=r-minus;
		            o-=r-minus;
		        }else{
		            y+=o;
		            break;
		        }
		        ++minus;
		        if(o>c-minus){
		            x+=c-minus;
		            o-=c-minus;
		        }else{
		            x+=o;
		            break;
		        }
		        if(o>r-minus){
		            y-=r-minus;
		            o-=r-minus;
		        }else{
		            y-=o;
		            break;
		        }
		        ++minus;
		        if(o>c-minus){
		             x-=c-minus;
		             o-=c-minus;
		        }else{
		            x-=o;
		            break;
		        }
		    }
		    System.out.println(x + " " + y);
	    }
	}

}
