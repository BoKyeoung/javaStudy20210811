package a7_조건;

public class ElseIf {

	public static void main(String[] args) {
		char c = 'a';
		
		if(c == 'A') {
			System.out.println("알파벳 A (a)입니다.");
		}else if(c == 'a') { // --> 코드 깔끄미
			System.out.println("알파벳 A (a)입니다.");
		}else {
			System.out.println("알파벳 A (a)가 아닙니다.");
		}
		

	}

}
