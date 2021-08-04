import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	int a ;
	String b;
	
	
	a = input.nextInt();
	b = input.next();

			System.out.println(a * (b.charAt(2) - '0'));
			System.out.println(a * (b.charAt(1) - '0'));
			System.out.println(a * (b.charAt(0) - '0'));
			System.out.println(a * Integer.parseInt(b));
			
		
		
	}
	
}