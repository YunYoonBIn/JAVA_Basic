
public class for�� {

	public static void main(String[] args) {
	    
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		//for���� �����ʱ�ȭ , ���ǽ� , �������� ���ٿ� ��� �ִ�
	 	for(int i = 1; i <= 100; i++) {
		    total1 = total1 + i;
	 	}
	 	System.out.println(total1);
	 	
	 	
	 	for(int i = 1; i <= 100; i++) {
	 		if(i % 2 != 0) {
	 		   continue; // �� �Ʒ� �ݺ����� ���� ��Ű�� ���� �� ������ ��� ����
	 		}
		    total2 = total2 + i;
	 	}
	 	System.out.println(total2);
	 	
	 	
	 	for(int i = 1; i <= 100; i++) {
		    total3 = total3 + i;  
	 		if(i == 50) {
	 			break; // �� �Ʒ� �ݺ����� �ƿ� ��������
	 		}
	 	}
	 	System.out.println(total3);
	}

}
