
public class 배열 {

	public static void main(String[] args) {

		int[] array1 = new int[100]; // 처음 만들어진 크기가 변하진 않음
		
		array1[0] = 50;
		array1[10] = 100;
		
		int[] array2 = new int[] {1,2,3,4}; // 방법2

		int[] array3 = {1,2,3,4}; // 방법 3

	    System.out.println(array3[3]); // 4
	    
	    int value = array3[0];
	    System.out.println(value); // 1
	    
	}
}