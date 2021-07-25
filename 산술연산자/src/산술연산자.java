
public class 산술연산자 {

	public static void main(String[] args) {
		
		int i1 = -5;  // -5
		int i2 = +i1; // -5 +는 부호 비트를 그대로 유지
		int i3 = -i1; //  5 - 음수를 양수로 양수를 음수로 바꿀수 있음
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);

		int i4 = ++i3;  // i3 = i3 + 1
		// ++가 앞에 붙어있으면 먼저 더해주고 더한 결과 값을 i4 값에 넣어줌 
		System.out.println(i4); // 6
		System.out.println(i3); // 6
		
		int i5 = i3++;  // i3 = i3 + 1
		// ++가 뒤에 붙어있으면  먼저 값을 대입을 시킴 , i3에 들어있던 6이 먼저 i5에 들어가고 i3은 i3에다가 1을 더함
		System.out.println(i5); // 6
		System.out.println(i3); // 7
		
		int i = 5;
		int j = 2;
		
		System.out.println(i + j); // 7 
		System.out.println(i - j); // 3
		System.out.println(i * j); // 10
		System.out.println(i / j); // 2 정수 끼리의 연산은 정수값으로 리턴됨 2.5라는 값을 나오게 하고 싶으면 피연산자 둘중에 하나는 실수여야됨 
		System.out.println(i / (double)j); // 2.5 <-캐스팅 연산   
		System.out.println(i % j); // 1 

	}
}
