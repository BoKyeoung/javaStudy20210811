package a8_�ݺ�;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		boolean mainFlag = true; // <= ���α׷� ���� break;�� �Ϸ��� ������ ����.

		while (mainFlag) {
			System.out.println("[���α׷� �޴�]");
			System.out.println("1. ������ ���� ����");
			System.out.println("q. ���α׷� ����");
			System.out.println("����� �Է��ϼ��� : ");
			String selecter = in.nextLine(); // ���ڿ� �Է�

			if (selecter.equals("1")) {
				while (true) {
					System.out.println("[������ ���� ����]");
					System.out.println("1. javaStudy ����");
					System.out.println("b. �ڷΰ���");
					System.out.println("q. ���α׷� ����");
					System.out.print("����� �Է��ϼ��� : ");
					selecter = in.nextLine();

					if (selecter.equals("1")) {
						System.out.println("[JanaStudy ����]");
					} else if (selecter.equals("b")) {
						break;
					}else if (selecter.equals("q")) {
						System.out.println("���α׷� ������...");
						mainFlag = false;
						break;
					} else {
						System.out.println("�߸� �� �Է��Դϴ�.");
					}
				} // end of while

			} else if (selecter.equals("q")) {
				System.out.println("���α׷� ������...");
				break;
			} else {
				System.out.println("�߸� �� �Է��Դϴ�.");
			}
		} // end of while <-- ��� ���α׷��� while�ȿ��� ���� ��
		
		System.out.println("���α׷� ����!"); // <-- while�� ���� ������ �� ���.

	}// end of main

}
