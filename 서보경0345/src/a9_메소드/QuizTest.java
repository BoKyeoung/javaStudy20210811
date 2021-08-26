package a9_메소드;

import java.util.Scanner;

public class QuizTest {
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
			// 종료가 되지않는다....또르륵...
			System.out.println();
			System.out.print("명령을 입력하세요 : ");
			String selecter = in.nextLine();
			
			System.out.println();
			
			System.out.println("[★별찍기★]");
			System.out.print("출력할 별의 개수를 입력하세요. : ");
			
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
				System.out.println("프로그램 종료중...");
				mainFlag = false;
				break;
				
			} else {
				System.out.println("잘못 된 입력입니다.");
			}
			
		} // end of wile
		System.out.println();
		System.out.println("입력한 수의 별을 찍었습니다.");
		System.out.println("===== ★ =====");
		System.out.println("프로그램이 종료됩니다.");
		System.out.println("===== end =====");
		
	} // end of main

	
	
	
	
} // end of class
