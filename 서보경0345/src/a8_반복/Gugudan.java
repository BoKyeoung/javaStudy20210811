package a8_�ݺ�;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("�ܼ��� �Է����ּ���.");
		int str = input.nextInt();
		System.out.println(str + "��");
		
		for(int i = 0; i < 9; i++) {
			int i2 = i + 1;
			System.out.println(str + " X " + i2 + " = " + (str*i2));
		}
		
		System.out.println("====================");
		
		int i = 0;
		while(i < 9) {
			int i2 = i + 1;
			System.out.println("2 X " + i2 + " = " + (2*i2));
			i++;
		}
		
		
		
		

	}

}
