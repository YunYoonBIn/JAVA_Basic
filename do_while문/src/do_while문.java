import java.util.Scanner;

public class do_while�� {

	public static void main(String[] args) {

		int value = 0;
		Scanner scan= new Scanner(System.in);
		
		//do while�� ���ǿ� ���� �ʾƵ� �ѹ��̶� ������
		do {
			value = scan.nextInt();	//�ݺ��� �����
			System.out.println("�Է¹��� �� :" + value );
		} while (value != 0);
            System.out.println("�ݺ��� ����");
	
	
	}
	
	

}
