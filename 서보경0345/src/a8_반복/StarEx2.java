package a8_�ݺ�;

public class StarEx2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			} // end of for - j
			System.out.println();
		} // end of for - i
		
		System.out.println();

//	         ��
//		for(int i = 6; i > 0; i--) {   
//			for(int j = 0; j < i - 1; j++) {
//				System.out.print("*");
//			} // end of for - j
//			System.out.println();
//		} // end of for - i
		
		// ����� ���� (���ҵǴ� ��)
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}// end of for - j
			System.out.println();
		}// end of for - i
		
		System.out.println();
		
		// ����� ���� (������ ����� �þ�� ��)
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
		
		// ����� ���� (�ݴ�� ������ �þ�� ��)
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}// end of for - j
			System.out.println();
		}// end of for - i	
		// Ǯ�� ��
		
		
		/*
		 *  0 1 2 3
		 *  0 2 4 6
		 *  0 5 7 9
		 * 
		 * */
		
		// ����� ���� (�ﰢ�� ��)
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


























