package cn.edu.qdu.game;

import java.util.Scanner;

public class Computer extends Player {
	String name;
	 String choice;
	public String inputName() {
		System.out.print("��ѡ��Է���ɫ��(1������ 2����Ȩ 3���ܲ�):");
		
		boolean flag=true;
		while(flag){
		Scanner input = new Scanner(System.in);
		int role = input.nextInt();
		switch (role) {
		case 1:
			name="����";
			flag=false;
			break;
			
		case 2:
			name="��Ȩ";
			flag=false;
			break;
			
		case 3:
			name="�ܲ�";
			flag=false;
			break;
			

		default:
			System.out.println("����������������룡");
			flag=true;
			break;
		}}
		return name;
	}

	public String myFist() {
		int number;
		number = 1+(int) Math.random() * 3;
		
		switch (number) {
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
			
			break;
		}
		
		System.out.println(name+"��ȭ��"+choice);
		return choice;
      
	}

}
