package a8_�ݺ�;

public class WhileEx {

	public static void main(String[] args) {
		
		int num = 1;
		int result = 0;
		while(num <= 100) {
			result += num; // <-- ���տ����� 
			num++; // <-- �ݺ� �� ó�� (�ݺ��� ���� �Ŀ� �������)
		}
		System.out.println(result);

	}

}
