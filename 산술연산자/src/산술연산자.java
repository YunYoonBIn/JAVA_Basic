
public class ��������� {

	public static void main(String[] args) {
		
		int i1 = -5;  // -5
		int i2 = +i1; // -5 +�� ��ȣ ��Ʈ�� �״�� ����
		int i3 = -i1; //  5 - ������ ����� ����� ������ �ٲܼ� ����
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);

		int i4 = ++i3;  // i3 = i3 + 1
		// ++�� �տ� �پ������� ���� �����ְ� ���� ��� ���� i4 ���� �־��� 
		System.out.println(i4); // 6
		System.out.println(i3); // 6
		
		int i5 = i3++;  // i3 = i3 + 1
		// ++�� �ڿ� �پ�������  ���� ���� ������ ��Ŵ , i3�� ����ִ� 6�� ���� i5�� ���� i3�� i3���ٰ� 1�� ����
		System.out.println(i5); // 6
		System.out.println(i3); // 7
		
		int i = 5;
		int j = 2;
		
		System.out.println(i + j); // 7 
		System.out.println(i - j); // 3
		System.out.println(i * j); // 10
		System.out.println(i / j); // 2 ���� ������ ������ ���������� ���ϵ� 2.5��� ���� ������ �ϰ� ������ �ǿ����� ���߿� �ϳ��� �Ǽ����ߵ� 
		System.out.println(i / (double)j); // 2.5 <-ĳ���� ����   
		System.out.println(i % j); // 1 

	}
}
