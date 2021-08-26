package a9_메소드;

import java.util.Scanner;

public class QuizNogada {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		boolean mainFlag = true; 
		while (mainFlag) {
			System.out.println("[별찍기 프로그램]");
			System.out.println("1. 문제1");
			System.out.println("2. 문제2");
			System.out.println("3. 문제3");
			System.out.println("4. 문제4");
			System.out.println("5. 문제5");
			System.out.println("q. 프로그램 종료");
			System.out.println("명령을 입력하세요 : ");
			String selecter = in.nextLine();

			if (selecter.equals("1")) {
				System.out.println("[별찍기 프로그램]");
				System.out.print("출력할 별의 개수를 입력하세요. : ");
				int star = in.nextInt();
				for (int i = 0; i < star; i++) {
					for (int j = 0; j < i + 1; j++) {
						System.out.print("★");
					}
					System.out.println();
					mainFlag = false;
				} // end of for - i
			} // end of if - 1

			else if (selecter.equals("2")) {
				System.out.println("[별찍기 프로그램]");
				System.out.print("출력할 별의 개수를 입력하세요. : ");
				int star = in.nextInt();
				for (int i = 0; i < star; i++) {
					for (int j = 0; j < i + 1; j++) {
						System.out.print("★");
					}
					System.out.println();
					mainFlag = false;
				} // end of for - i
			} // end of else if - 2

			else if (selecter.equals("3")) {
				System.out.println("[별찍기 프로그램]");
				System.out.print("출력할 별의 개수를 입력하세요. : ");
				int star = in.nextInt();
				for (int i = 0; i < star; i++) {
					for (int j = 0; j < i + 1; j++) {
						System.out.print("★");
					}
					System.out.println();
					mainFlag = false;
				} // end of for - i
			} // end of else if - 3

			else if (selecter.equals("4")) {
				System.out.println("[별찍기 프로그램]");
				System.out.print("출력할 별의 개수를 입력하세요. : ");
				int star = in.nextInt();
				for (int i = 0; i < star; i++) {
					for (int j = 0; j < i + 1; j++) {
						System.out.print("★");
					}
					System.out.println();
					mainFlag = false;
				} // end of for - i
			} // end of else if - 4

			else if (selecter.equals("5")) {
				System.out.println("[별찍기 프로그램]");
				System.out.print("출력할 별의 개수를 입력하세요. : ");
				int star = in.nextInt();
				for (int i = 0; i < star; i++) {
					for (int j = 0; j < i + 1; j++) {
						System.out.print("★");
					}
					System.out.println();
					mainFlag = false;
				} // end of for - i
			} // end of else if - 5
			
			else if (selecter.equals("q")) {
				System.out.println("프로그램 종료중...");
				break;
			} else {
				System.out.println("잘못 된 입력입니다. 다시 입력해주세요.");
			}
		} // end of while <-- 모든 프로그램은 while안에서 돈다 ★

		System.out.println("입력한 수의 별을 찍었습니다."); // <-- while을 빠져 나왔을 때 사용.

	}// end of main

}
