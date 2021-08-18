package a7_조건;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// Scanner를 통한 표준 입력
		// grade <- 변수명 (문자열로 선언)
		// 성적을 입력해주세요.(A ~ F): 문자열 입력
		// if(A등급 true){ 학생의 성적은 90 ~ 100점 입니다.}
		// else if(B등급 true){80 ~ 89점 입니다.}
		// ... F
		// else{ A ~ F 까지만 입력할 수 있습니다.}
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("성적을 입력해주세요:");
		String grade = input.nextLine();
		
		// || -> 같다 의 연산자  
		
		if(grade.equals("A") || grade.equals("a")) {
			System.out.println("학생의 성적은 90 ~ 100점입니다.");
		}else if(grade.equals("B") || grade.equals("b")) {
			System.out.println("학생의 성적은 80 ~ 89점입니다.");
		}else if(grade.equals("C") || grade.equals("c")) {
			System.out.println("학생의 성적은 70 ~ 79점입니다.");
		}
		else if(grade.equals("D") || grade.equals("d")) {
			System.out.println("학생의 성적은 60 ~ 69점입니다.");
		}else if(grade.equals("F") || grade.equals("f")) {
			System.out.println("학생의 성적은 0 ~ 59점입니다.");
		}else {
			System.out.println("A ~ F 까지만 입력할 수 있습니다.");
		}

	}

}
