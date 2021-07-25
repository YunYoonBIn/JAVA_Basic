
public class 연산자_우선순위 {

	public static void main(String[] args) {
		
		int a = 5;
	    int b = 10;
	    int c = 15;
	    
	    System.out.println(a - b * c); // b * c - a
        System.out.println((a - b) * c); // a - b * c
	    System.out.println(a > 5 && b > 5); // 양쪽이 모두 true 일때만 true
	    System.out.println(a > 5 || b > 5); // 하나만 true이면 true
	  //System.out.println(++a - 5);  a + 1 - 5
	    System.out.println(a++ - 5); // a - 5 + 1
	    System.out.println(a); // 6
	}

}
