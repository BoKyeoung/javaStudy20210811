package a8_반복;

public class StarEx2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			} // end of for - j
			System.out.println();
		} // end of for - i
		
		System.out.println();

//	         나
//		for(int i = 6; i > 0; i--) {   
//			for(int j = 0; j < i - 1; j++) {
//				System.out.print("*");
//			} // end of for - j
//			System.out.println();
//		} // end of for - i
		
		// 강사님 예제 (감소되는 별)
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}// end of for - j
			System.out.println();
		}// end of for - i
		
		System.out.println();
		
		// 강사님 예제 (공백이 생기는 늘어나는 별)
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			} // end of for - j
			System.out.println();
		} // end of for - i
		
		System.out.println();
		
		// 강사님 예제 (반대로 공백이 늘어나는 별)
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}// end of for - j
			System.out.println();
		}// end of for - i	
		// 풀기 ★
		
		
		/*
		 *  0 1 2 3
		 *  0 2 4 6
		 *  0 5 7 9
		 * 
		 * */
		
		// 강사님 예제 (삼각형 별)
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i + 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (i*2)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	} // end of main

}


























