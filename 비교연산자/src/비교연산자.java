
public class �񱳿����� {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 10;
		
		System.out.println(i == j); // �����ϱ�? true
		System.out.println(i != j); // �ٸ��ϱ�? false
		System.out.println(i < j); // i�� j���� �۽��ϱ�? false 
		System.out.println(i <= j); // i�� j���� �۰ų� �����ϱ�? true
		System.out.println(i > j); // i�� j���� Ů�ϱ�? false
		System.out.println(i >= j); // i�� j���� ũ�ų� �����ϱ�? true
		
		i += 10; // i = i + 10; ���� ���� ������
	
		System.out.println(i); // 20
		
		System.out.println(i -=5); // 15
		
		System.out.println(i); // 15
	}

}
