
public class ��_������ {

	public static void main(String[] args) {
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2); // �Ѵ� ���� �ƴϱ� ������ false
		System.out.println(b1 && b3); // �Ѵ� ���̶� true
		System.out.println(b1 || b2); // ���� �ϳ��� ���̸� true
		System.out.println(b1 || b3); // �翬�� �ΰ��� ���̿��� true
		System.out.println(b2 || b2); // �翬�� �ΰ��� false�� false
        
		int score = 100;
		if (score <=100 && score >=70) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		System.out.println(b1 ^ b3); // �ΰ��� �ٸ��� true
		System.out.println(b1 ^ b2);
		System.out.println(!b2);     // ���� ������ 
	}

}
