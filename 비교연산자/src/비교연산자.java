
public class 비교연산자 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 10;
		
		System.out.println(i == j); // 같습니까? true
		System.out.println(i != j); // 다릅니까? false
		System.out.println(i < j); // i가 j보다 작습니까? false 
		System.out.println(i <= j); // i가 j보다 작거나 같습니까? true
		System.out.println(i > j); // i가 j보다 큽니까? false
		System.out.println(i >= j); // i가 j보다 크거나 같습니까? true
		
		i += 10; // i = i + 10; 복합 대입 연산자
	
		System.out.println(i); // 20
		
		System.out.println(i -=5); // 15
		
		System.out.println(i); // 15
	}

}
