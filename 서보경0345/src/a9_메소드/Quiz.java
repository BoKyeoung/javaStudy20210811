package a9_�޼ҵ�;

import java.util.Scanner;

public class Quiz {
	Scanner in = new Scanner(System.in);
	String selecter;

	
//	public void ProcStart(String selecter, int star) {
//		this.selecter = selecter = in.nextLine();
//		this.star = star = in.nextInt();
//	} // end of procStart

//		public void showInfo() {
//		System.out.println("[�ں�����]");
//		System.out.print("����� ���� ������ �Է��ϼ���. : ");
//	}
	
	public Quiz(int star) {
		System.out.println();
		for (int i = 0; i < star; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("��");
			}
			System.out.println();
		} // end of for - i
	} // end of quiz
	
			
	
	/*
	 * [����� ���α׷�]
	 * 1. ����1
	 * 2. ����2
	 * 3. ����3
	 * 4. ����4
	 * 5. ����5
	 * q. ���α׷� ����
	 * ����� �Է��ϼ���: 1
	 * 
	 * ����� ���� ������ �Է��ϼ���: 10
	 * 
	 * void procStart(��� ��ȣ, 10){
	 * 		if(1���̸�){
	 * 			void quiz1(���� ����){
	 * 				for()
	 * 			}
	 * 		} else if(2���̸�){
	 * 
	 * 		}
	 * }
	 * 
	 */
	
	
} // end of class
