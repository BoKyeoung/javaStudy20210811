package a2_변수;

public class MyInfo {

	public static void main(String[] args) {
		/** <자료형>
		 *  
		 *  논리형(boolean) = true, false
		 *  boolean 변수명 = true;
		 *  boolean 변수명 = false;
		 *  
		 *  문자형(char) 캐릭터 = a~z, 한글(1글자만) *작은따옴표만 사용.
		 *  char 변수명 = 'a';
		 *  char 변수명 = '가';
		 *  char 변수명 = '1';
		 *  char 변수명 = '$';
		 *  
		 *  문자열자료형(String) 스트링 = "문자열을 저장할 수 있습니다."
		 *  String 변수명 = "안녕하세요. 이춘식입니다.";
		 *  
		 *  정수형(int) Integer = 0 ~ 10 십진수를 표현
		 *  int 변수명 = 100;
		 *  
		 *  실수형(double) = 0.0 ~ 0.9999 실수단위(소숫점) 표현
		 *  double 변수명 = 100.08775;
		 *  
		 */
		
		// 정수형으로 생년월일 중 년도를 저장하는 year변수
		// 정수형으로 생년월일 중 월을 저장하는 month변수
		// 정수형으로 생년월일 중 일을 저장하는 day변수
		
		// 이름을 문자형으로 표현 변수명은 f,s,th
		// 시력 left, right 각각 실수형으로 변수 저장
		// 성별로 논리형 maleFemale변수명 남 true, 여 false;
		
		// 생년월일 : 0000년 00월 00일
		// 이름 : 이춘식
		// 시력(R) : 0.5
		// 시력(L) : 0.7
		// 성별 : true
		

		int year = 2000;
		int mounth = 06;
		int day = 15;
		
		char f = '이';
		char s = '춘';
		char th = '식';
		
		String name = "이춘삼";
		
		double left = 0.7;
		double right = 0.5;
		boolean maleFmale = true;
		
		System.out.print("생년월일 : " + year + "년도 ");
		System.out.print(mounth + "월 ");
		System.out.println(day + "일");
		
		System.out.print("이름 : " + f);
		System.out.print(s);
		System.out.println(th);
		
		System.out.println("별명 : " + name); // 문자열 (String)
		
		System.out.println("시력(R) : " + right);
		System.out.println("시력(L) : " + left);
		
		System.out.println("성별 : " + maleFmale);
		
		
		
		
	}
	

}
