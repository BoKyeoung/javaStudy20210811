package a9_메소드;

import java.util.Scanner;

public class Quiz {
	Scanner in = new Scanner(System.in);
	String selecter;

	
//	public void ProcStart(String selecter, int star) {
//		this.selecter = selecter = in.nextLine();
//		this.star = star = in.nextInt();
//	} // end of procStart

//		public void showInfo() {
//		System.out.println("[★별찍기★]");
//		System.out.print("출력할 별의 개수를 입력하세요. : ");
//	}
	
	public Quiz(int star) {
		System.out.println();
		for (int i = 0; i < star; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("★");
			}
			System.out.println();
		} // end of for - i
	} // end of quiz
	
			
	
	/*
	 * [별찍기 프로그램]
	 * 1. 문제1
	 * 2. 문제2
	 * 3. 문제3
	 * 4. 문제4
	 * 5. 문제5
	 * q. 프로그램 종료
	 * 명령을 입력하세요: 1
	 * 
	 * 출력할 별의 개수를 입력하세요: 10
	 * 
	 * void procStart(명령 번호, 10){
	 * 		if(1번이면){
	 * 			void quiz1(별의 개수){
	 * 				for()
	 * 			}
	 * 		} else if(2번이면){
	 * 
	 * 		}
	 * }
	 * 
	 */
	
	
} // end of class
