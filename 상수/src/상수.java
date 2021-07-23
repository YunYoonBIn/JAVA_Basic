
public class 상수 {

	public static void main(String[] args) {
		
		int i;
		i = 10;
		i = 5; 
		// 변수이기 때문에 전에 있던 10이 없어지고 5가 저장됨
		
		final int J;
		// 상수를 선언 할 때에는 모두 대문자로만 구성된 명사를 사용하는게 관례
		J = 10;
		// 상수는 중간에 값을 못바꿈
		
		//예1) 값이 바뀌면 안될때
		double circleArea;
		final double PI = 3.14159;
		circleArea = 3 * 3 * 3 * PI;
		
		//예2) 값만 봤을때 저 숫자가 무엇을 의미하는지 모를때
	    final int OIL_PRICE = 1450;
		int totalPrice = 50 * OIL_PRICE;

	}

}
