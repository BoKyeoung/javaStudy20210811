package a8_반복;

public class WhileEx {

	public static void main(String[] args) {
		
		int num = 1;
		int result = 0;
		while(num <= 100) {
			result += num; // <-- 복합연산자 
			num++; // <-- 반복 후 처리 (반복이 끝난 후에 적어야함)
		}
		System.out.println(result);

	}

}
