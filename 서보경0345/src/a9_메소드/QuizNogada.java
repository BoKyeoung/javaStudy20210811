package a9_�޼ҵ�;

import java.util.Scanner;

public class QuizNogada {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		boolean mainFlag = true; 
		while (mainFlag) {
			System.out.println("[����� ���α׷�]");
			System.out.println("1. ����1");
			System.out.println("2. ����2");
			System.out.println("3. ����3");
			System.out.println("4. ����4");
			System.out.println("5. ����5");
			System.out.println("q. ���α׷� ����");
			System.out.println("����� �Է��ϼ��� : ");
			String selecter = in.nextLine();

			if (selecter.equals("1")) {
				System.out.println("[����� ���α׷�]");
				System.out.print("����� ���� ������ �Է��ϼ���. : ");
				int star = in.nextInt();
				for (int i = 0; i < star; i++) {
					for (int j = 0; j < i + 1; j++) {
						System.out.print("��");
					}
					System.out.println();
					mainFlag = false;
				} // end of for - i
			} // end of if - 1

			else if (selecter.equals("2")) {
				System.out.println("[����� ���α׷�]");
				System.out.print("����� ���� ������ �Է��ϼ���. : ");
				int star = in.nextInt();
				for (int i = 0; i < star; i++) {
					for (int j = 0; j < i + 1; j++) {
						System.out.print("��");
					}
					System.out.println();
					mainFlag = false;
				} // end of for - i
			} // end of else if - 2

			else if (selecter.equals("3")) {
				System.out.println("[����� ���α׷�]");
				System.out.print("����� ���� ������ �Է��ϼ���. : ");
				int star = in.nextInt();
				for (int i = 0; i < star; i++) {
					for (int j = 0; j < i + 1; j++) {
						System.out.print("��");
					}
					System.out.println();
					mainFlag = false;
				} // end of for - i
			} // end of else if - 3

			else if (selecter.equals("4")) {
				System.out.println("[����� ���α׷�]");
				System.out.print("����� ���� ������ �Է��ϼ���. : ");
				int star = in.nextInt();
				for (int i = 0; i < star; i++) {
					for (int j = 0; j < i + 1; j++) {
						System.out.print("��");
					}
					System.out.println();
					mainFlag = false;
				} // end of for - i
			} // end of else if - 4

			else if (selecter.equals("5")) {
				System.out.println("[����� ���α׷�]");
				System.out.print("����� ���� ������ �Է��ϼ���. : ");
				int star = in.nextInt();
				for (int i = 0; i < star; i++) {
					for (int j = 0; j < i + 1; j++) {
						System.out.print("��");
					}
					System.out.println();
					mainFlag = false;
				} // end of for - i
			} // end of else if - 5
			
			else if (selecter.equals("q")) {
				System.out.println("���α׷� ������...");
				break;
			} else {
				System.out.println("�߸� �� �Է��Դϴ�. �ٽ� �Է����ּ���.");
			}
		} // end of while <-- ��� ���α׷��� while�ȿ��� ���� ��

		System.out.println("�Է��� ���� ���� ������ϴ�."); // <-- while�� ���� ������ �� ���.

	}// end of main

}
