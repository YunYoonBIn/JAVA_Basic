
public class if문 {

	public static void main(String[] args) {
		
		int x = 50;
		int y = 60;
		
		/*
		if (x < y ) {
			System.out.println("x는 y보다 작습니다.");
		}
		  
		if (x != y) {
			System.out.println("x는 y와 다릅니다.");  
		}
		*/
		
		/*
		if (x == y) {
			System.out.println("x는 y와 같습니다.");
		} else {
			System.out.println("x는 y와 다릅니다.");
		}
	    */
		
		if (x == y) {
			System.out.println("x는 y와 같습니다.");
		}else if(x < y) {
			System.out.println("x는 y보다 작습니다.");
		}else {
			System.out.println("x는 y와 다릅니다");
		}
		//else if는 속도 저하의 원인이 될수있다
		
	}

}
