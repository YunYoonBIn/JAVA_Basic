
public class while�� {

	public static void main(String[] args) {

		int i = 0;
		
		while (i < 10) {
			System.out.println(i);
			i++; // i = i + 1  
		}	
		
		int total = 0;
		int j = 1;
		
		while (j <= 100) {
			total = total + j; // 0 (total) + 1 (j)
			j ++;
			
		}
		System.out.println(total);
		
		while(true) { // ���� ��ü�� ������ ���� ���ѷ����� ���� ����
			System.out.println("hello");
		}
	}
}
