package a7_����;

public class ElseEx {

	public static void main(String[] args) {
		if('A' == 'a') { // �ƽ�Ű�ڵ忡�� �빮�ڿ� �ҹ��ڰ� �ٸ�.
			System.out.println("�� ���ڰ� �����ϴ�.");
		}/*if*/else {
			if('A' == 'A') {
				System.out.println("�� ���ڰ� �����ϴ�.");
			}/*if*/else {
				System.out.println("�� ���ڰ� �ٸ��ϴ�.");
			}
		}/*else*/

	}

}
