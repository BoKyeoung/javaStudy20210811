package a9_�޼ҵ�;

import java.util.Scanner;

public class QuizTest {
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
			// ���ᰡ �����ʴ´�....�Ǹ���...
			System.out.println();
			System.out.print("����� �Է��ϼ��� : ");
			String selecter = in.nextLine();
			
			System.out.println();
			
			System.out.println("[�ں�����]");
			System.out.print("����� ���� ������ �Է��ϼ���. : ");
			
			int star = in.nextInt();
			
			if (selecter.equals("1")) {
				
				Quiz quiz = new Quiz(star);
				mainFlag = false;
			} // end of if - 1
			
			else if (selecter.equals("2")) {
				Quiz quiz = new Quiz(star);
				mainFlag = false;
			} // end of else if - 2
			
			else if (selecter.equals("3")) {
				Quiz quiz = new Quiz(star);
				mainFlag = false;
			} // end of else if - 3

			else if (selecter.equals("4")) {
				Quiz quiz = new Quiz(star);
				mainFlag = false;
			} // end of else if - 4

			else if (selecter.equals("5")) {
				Quiz quiz = new Quiz(star);
				mainFlag = false;
			} // end of else if - 5
			
			else if (selecter.equals("q")) {
				System.out.println("���α׷� ������...");
				mainFlag = false;
				break;
				
			} else {
				System.out.println("�߸� �� �Է��Դϴ�.");
			}
			
		} // end of wile
		System.out.println();
		System.out.println("�Է��� ���� ���� ������ϴ�.");
		System.out.println("===== �� =====");
		System.out.println("���α׷��� ����˴ϴ�.");
		System.out.println("===== end =====");
		
	} // end of main

	
	
	
	
} // end of class
