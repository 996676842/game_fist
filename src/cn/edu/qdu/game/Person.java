package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player {
        String choice;
      String name;
	public String inputName() {
		System.out.print("���������������");
		Scanner input = new Scanner(System.in);
         name = input.next();

		return name;

	}

	public String myFist() {
		System.out.println();
		System.out.print("���ȭ��1.���� 2.ʯͷ 3.����������Ӧ�����֣���");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		
		switch (a) {
		case 1:
			choice="����";
			break;
		case 2:
			choice="ʯͷ";
			break;
		case 3:
			choice="��";
			break;

		default:
			System.out.println("����������������룡");
			break;
		}
		System.out.println("���ȭ��"+choice);
		return choice;
		

	}
}
