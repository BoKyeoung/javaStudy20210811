package a8_�ݺ�;

import java.util.Scanner;

public class GuGudanAll {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("���� �ܼ� : ");
		int gudanStart = in.nextInt();
		System.out.println("������ �ܼ� : ");
		int gudanEnd = in.nextInt();
		
		System.out.println(gudanStart + "��");
		for(int j = 0; j < 9; j++) {
			int j2 = j+1;
			System.out.println(gudanStart + " x " + j2 + " = " + (gudanStart * j2));
		}
		System.out.println(gudanEnd + "��");
		for(int j = 0; j < 9; j++) {
			int j2 = j+1;
			System.out.println(gudanEnd + " x " + j2 + " = " + (gudanEnd * j2));
		}
		
/*
		System.out.println("���۴ܼ�");
		Scanner gugu = new Scanner(System.in);
		int gu = gugu.nextInt();

		System.out.println("������ �ܼ�");
		Scanner gugu2 = new Scanner(System.in);
		int gu2 = gugu2.nextInt();

		for(int i = gu; gu < 8; gu++) {
			System.out.println(gu + "��");
		for (int j = 0; j < 9; j++) {
			int j2 = j + 1;
			System.out.println(gu + " x " + j2 + " = " + (gu * j2));
			} // end of j
		} // end of i
 
		
		System.out.println(gu + "��");
		for (int j = 0; j < 9; j++) {
			int j2 = j + 1;
			System.out.println(gu + " x " + j2 + " = " + (gu * j2));
		} // end of gu
		System.out.println();
		System.out.println(gu2 + "��");
		for (int j = 0; j < 9; j++) {
			int j2 = j + 1;
			System.out.println(gu2 + " x " + j2 + " = " + (gu2 * j2));
		} // end of gu2
		System.out.println(); */
	}

}
