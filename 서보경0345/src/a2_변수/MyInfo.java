package a2_����;

public class MyInfo {

	public static void main(String[] args) {
		/** <�ڷ���>
		 *  
		 *  ����(boolean) = true, false
		 *  boolean ������ = true;
		 *  boolean ������ = false;
		 *  
		 *  ������(char) ĳ���� = a~z, �ѱ�(1���ڸ�) *��������ǥ�� ���.
		 *  char ������ = 'a';
		 *  char ������ = '��';
		 *  char ������ = '1';
		 *  char ������ = '$';
		 *  
		 *  ���ڿ��ڷ���(String) ��Ʈ�� = "���ڿ��� ������ �� �ֽ��ϴ�."
		 *  String ������ = "�ȳ��ϼ���. ������Դϴ�.";
		 *  
		 *  ������(int) Integer = 0 ~ 10 �������� ǥ��
		 *  int ������ = 100;
		 *  
		 *  �Ǽ���(double) = 0.0 ~ 0.9999 �Ǽ�����(�Ҽ���) ǥ��
		 *  double ������ = 100.08775;
		 *  
		 */
		
		// ���������� ������� �� �⵵�� �����ϴ� year����
		// ���������� ������� �� ���� �����ϴ� month����
		// ���������� ������� �� ���� �����ϴ� day����
		
		// �̸��� ���������� ǥ�� �������� f,s,th
		// �÷� left, right ���� �Ǽ������� ���� ����
		// ������ ���� maleFemale������ �� true, �� false;
		
		// ������� : 0000�� 00�� 00��
		// �̸� : �����
		// �÷�(R) : 0.5
		// �÷�(L) : 0.7
		// ���� : true
		

		int year = 2000;
		int mounth = 06;
		int day = 15;
		
		char f = '��';
		char s = '��';
		char th = '��';
		
		String name = "�����";
		
		double left = 0.7;
		double right = 0.5;
		boolean maleFmale = true;
		
		System.out.print("������� : " + year + "�⵵ ");
		System.out.print(mounth + "�� ");
		System.out.println(day + "��");
		
		System.out.print("�̸� : " + f);
		System.out.print(s);
		System.out.println(th);
		
		System.out.println("���� : " + name); // ���ڿ� (String)
		
		System.out.println("�÷�(R) : " + right);
		System.out.println("�÷�(L) : " + left);
		
		System.out.println("���� : " + maleFmale);
		
		
		
		
	}
	

}
