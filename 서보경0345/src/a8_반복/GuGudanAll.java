package a8_반복;

import java.util.Scanner;

public class GuGudanAll {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("시작 단수 : ");
		int gudanStart = in.nextInt();
		System.out.println("마지막 단수 : ");
		int gudanEnd = in.nextInt();
		
		System.out.println(gudanStart + "단");
		for(int j = 0; j < 9; j++) {
			int j2 = j+1;
			System.out.println(gudanStart + " x " + j2 + " = " + (gudanStart * j2));
		}
		System.out.println(gudanEnd + "단");
		for(int j = 0; j < 9; j++) {
			int j2 = j+1;
			System.out.println(gudanEnd + " x " + j2 + " = " + (gudanEnd * j2));
		}
		
/*
		System.out.println("시작단수");
		Scanner gugu = new Scanner(System.in);
		int gu = gugu.nextInt();

		System.out.println("마지막 단수");
		Scanner gugu2 = new Scanner(System.in);
		int gu2 = gugu2.nextInt();

		for(int i = gu; gu < 8; gu++) {
			System.out.println(gu + "단");
		for (int j = 0; j < 9; j++) {
			int j2 = j + 1;
			System.out.println(gu + " x " + j2 + " = " + (gu * j2));
			} // end of j
		} // end of i
 
		
		System.out.println(gu + "단");
		for (int j = 0; j < 9; j++) {
			int j2 = j + 1;
			System.out.println(gu + " x " + j2 + " = " + (gu * j2));
		} // end of gu
		System.out.println();
		System.out.println(gu2 + "단");
		for (int j = 0; j < 9; j++) {
			int j2 = j + 1;
			System.out.println(gu2 + " x " + j2 + " = " + (gu2 * j2));
		} // end of gu2
		System.out.println(); */
	}

}
