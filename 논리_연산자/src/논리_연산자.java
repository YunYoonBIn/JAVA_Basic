
public class 논리_연산자 {

	public static void main(String[] args) {
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2); // 둘다 참이 아니기 때문에 false
		System.out.println(b1 && b3); // 둘다 참이라서 true
		System.out.println(b1 || b2); // 둘중 하나만 참이면 true
		System.out.println(b1 || b3); // 당연히 두개다 참이여도 true
		System.out.println(b2 || b2); // 당연히 두개다 false면 false
        
		int score = 100;
		if (score <=100 && score >=70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		System.out.println(b1 ^ b3); // 두개가 다를때 true
		System.out.println(b1 ^ b2);
		System.out.println(!b2);     // 부정 연산자 
	}

}
