import java.math.BigInteger;
import java.util.Scanner;

public class Plus {

	//practice BigInteger
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger x = BigInteger.ONE, y = BigInteger.ONE;
		x = sc.nextBigInteger();
		y = sc.nextBigInteger();
		System.out.println(x.add(y));	
	}

}
