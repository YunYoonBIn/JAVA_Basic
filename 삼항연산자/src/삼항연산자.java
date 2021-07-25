
public class 삼항연산자 {

	public static void main(String[] args) {
		
		int b1 = (5 > 4) ? 50 : 40; // 5가 4보다 큽니까 ? 맞다면 50 다르면 40 이라는 값을 b1에다 넣어주세요 
		
		System.out.println(b1);

		int b2 = (5 < 4) ? 50 : 40; // 5가 4보다 작습니까? 맞다면 50 다르면 40 이라는 값을 b2에다 넣어주세요
	
	    System.out.println(b2);
	    
	    int b3 = 0;
	    if (5 < 4) {
			b3 = 50;
		}else {
			b3 = 40;
		}
			System.out.println(b3);
			//if문과 삼항연산자는 크게 다를게 없음 편한거 쓰면 됨
	}

}
