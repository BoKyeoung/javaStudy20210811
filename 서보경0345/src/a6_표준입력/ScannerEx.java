package a6_표준입력;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		/**
		 *  String 기본제공 클래스
		 *  Scanner 외부 클래스
		 *  
		 *  자동import
		 *  Ctrl + 스페이스바 -> 하나의 클래스 import
		 *  Ctrl + Shift + o -> 모든 클래스 import
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요.");
		
		System.out.print("첫번째 수 : ");
		String str = input.nextLine(); //한 문장 전부 출력
		
		System.out.print("두번째 수 : ");
		String str2 = input.nextLine();
		
		//String str = input.next(); // 띄어쓰기 앞 부분까지만 출력
		//String str2 = input.next();
		System.out.println("결과 : ");
		
		/**
		 *  문자열 -> 자료형, 형변환 방법
		 * 
		 *  1.출력에서 사용 
		 *  System.out.println(Integer.parseInt(str) + Integer.parseInt(str2));
		 *  
		 *  2.변수 생성
		 *  int i = Integer.parseInt(str);
		 *  int i2 = Integer.parseInt(str2);
		 *  System.out.println(i + i2);
		 *  
		 */
		int i = Integer.parseInt(str);
		int i2 = Integer.parseInt(str2);
		 
		System.out.println(i + i2);

	}

}
