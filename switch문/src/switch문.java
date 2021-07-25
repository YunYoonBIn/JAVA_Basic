
public class switch문 {

	public static void main(String[] args) {

		int value = 1;
		
		switch (value) {
		case 1:
			System.out.println(1);
		case 2: 
			System.out.println(2);
		case 3:
			System.out.println(3);
			default : 
				System.out.println("그 외 다른 숫자");
				// 스위치는 만난 케이스 부터 나머지를 모두 출력함 
		}
		
		switch (value) {
		case 1:
			System.out.println(1);
			break;
		case 2: 
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
			default : 
				System.out.println("그 외 다른 숫자");
				// break를 사용하면 밸류가 1이고 케이스가 1에 와서 케이스 1만 출력하고 멈춤
		
	}
        String str = "A";
        switch (str) {
        case "A" : 
            System.out.println("A");
            break;
        case "B" : 
    	       System.out.println("B");
    	       // 문자열도 스위치 사용 가능
     }
}
}