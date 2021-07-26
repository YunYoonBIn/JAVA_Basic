
public class for문 {

	public static void main(String[] args) {
	    
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		//for문은 변수초기화 , 조건식 , 증감식이 한줄에 모두 있다
	 	for(int i = 1; i <= 100; i++) {
		    total1 = total1 + i;
	 	}
	 	System.out.println(total1);
	 	
	 	
	 	for(int i = 1; i <= 100; i++) {
	 		if(i % 2 != 0) {
	 		   continue; // 그 아래 반복문만 실행 시키지 않음 그 위에는 계속 실행
	 		}
		    total2 = total2 + i;
	 	}
	 	System.out.println(total2);
	 	
	 	
	 	for(int i = 1; i <= 100; i++) {
		    total3 = total3 + i;  
	 		if(i == 50) {
	 			break; // 그 아래 반복문을 아예 빠져나옴
	 		}
	 	}
	 	System.out.println(total3);
	}

}
