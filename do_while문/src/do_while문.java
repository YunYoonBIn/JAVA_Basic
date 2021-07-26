import java.util.Scanner;

public class do_while문 {

	public static void main(String[] args) {

		int value = 0;
		Scanner scan= new Scanner(System.in);
		
		//do while는 조건에 맞지 않아도 한번이라도 수행함
		do {
			value = scan.nextInt();	//반복할 문장들
			System.out.println("입력받은 값 :" + value );
		} while (value != 0);
            System.out.println("반복문 종료");
	
	
	}
	
	

}
