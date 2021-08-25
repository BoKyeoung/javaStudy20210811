package a8_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		boolean mainFlag = true; // <= 프로그램 내에 break;를 하려면 변수로 지정.

		while (mainFlag) {
			System.out.println("[프로그램 메뉴]");
			System.out.println("1. 김준일 강사 폴더");
			System.out.println("q. 프로그램 종료");
			System.out.println("명령을 입력하세요 : ");
			String selecter = in.nextLine(); // 문자열 입력

			if (selecter.equals("1")) {
				while (true) {
					System.out.println("[김준일 강사 폴더]");
					System.out.println("1. javaStudy 폴더");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.print("명령을 입력하세요 : ");
					selecter = in.nextLine();

					if (selecter.equals("1")) {
						System.out.println("[JanaStudy 폴더]");
					} else if (selecter.equals("b")) {
						break;
					}else if (selecter.equals("q")) {
						System.out.println("프로그램 종료중...");
						mainFlag = false;
						break;
					} else {
						System.out.println("잘못 된 입력입니다.");
					}
				} // end of while

			} else if (selecter.equals("q")) {
				System.out.println("프로그램 종료중...");
				break;
			} else {
				System.out.println("잘못 된 입력입니다.");
			}
		} // end of while <-- 모든 프로그램은 while안에서 돈다 ★
		
		System.out.println("프로그램 종료!"); // <-- while을 빠져 나왔을 때 사용.

	}// end of main

}
