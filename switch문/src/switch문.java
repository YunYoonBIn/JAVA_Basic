
public class switch�� {

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
				System.out.println("�� �� �ٸ� ����");
				// ����ġ�� ���� ���̽� ���� �������� ��� ����� 
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
				System.out.println("�� �� �ٸ� ����");
				// break�� ����ϸ� ����� 1�̰� ���̽��� 1�� �ͼ� ���̽� 1�� ����ϰ� ����
		
	}
        String str = "A";
        switch (str) {
        case "A" : 
            System.out.println("A");
            break;
        case "B" : 
    	       System.out.println("B");
    	       // ���ڿ��� ����ġ ��� ����
     }
}
}