package a7_조건;

public class ElseEx {

	public static void main(String[] args) {
		if('A' == 'a') { // 아스키코드에선 대문자와 소문자가 다름.
			System.out.println("두 문자가 같습니다.");
		}/*if*/else {
			if('A' == 'A') {
				System.out.println("두 문자가 같습니다.");
			}/*if*/else {
				System.out.println("두 문자가 다릅니다.");
			}
		}/*else*/

	}

}
