
public class 배열2 {

	public static void main(String[] args) {
		
		int[] iarray =new int[100]; //인트값 100개를 받을 수 있는 배열
		iarray[0] = 1;
		iarray[1] = 2;
		
	    for (int i = 0; i < iarray.length; i++) {
			                 //배열 크기 출력
	    	iarray[i] = i + 1;
		}
	    
	    int sum = 0;
	    for (int i = 0; i < iarray.length; i++) {
		sum = sum + iarray[i];	
		}
	System.out.println(sum);
	}

}
